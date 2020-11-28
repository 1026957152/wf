package com.example.wf;



import camunda.CamundaOuterClass;
import camunda.CamundaServiceGrpc;
//import camundajar.impl.scala.util.parsing.input.Page;

import com.google.protobuf.Timestamp;
import com.google.rpc.Code;
import com.google.rpc.Status;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;
//import net.devh.boot.grpc.server.service.GrpcService;

//import org.camunda.bpm.engine.RuntimeService;
//import net.devh.boot.grpc.server.service.GrpcService;
import net.devh.boot.grpc.server.service.GrpcService;

import org.springframework.beans.factory.annotation.Autowired;
import position.PositionGrpc;
import verification.TrackingOuterClass;
//import org.springframework.kafka.core.KafkaTemplate;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

//@GrpcService
	public class AttenceICamundaImpl extends CamundaServiceGrpc.CamundaServiceImplBase {

/*	@Autowired
	public AreaGrpcClient areaGrpcClient;*/
	@Autowired
	public VerificationGrpcClient verificationGrpcClient;
//	public KafkaTemplate<String, Object> simpleProducer;

/*
		@Override
		public void Camunda(CamundaOuterClass.Request req, StreamObserver<CamundaOuterClass.Reply> responseObserver) {
			System.out.println("service:"+req.getId());
			User user = userRepository.findByUuid(req.getId());
			List<Employee> employeees = employeeRepository.findByUserNo(user.getUserId());
			Optional<Employee> employeeOptional = employeees.stream().filter(e->!EmployeeStatusEnum.Terminated.getText().equals(e.getStatus())).findFirst();

			Set<String> userCamundas = new HashSet<String>();
			if(employeeOptional.isPresent()){
				Set<String> employeeCamundas = permissionService.queryEmployeeCamundas(employeeOptional.get().getUuid());
				userCamundas.addAll(employeeCamundas);
			}




			Set<String> userCamundas___ = permissionService.queryUserCamundas(user.getId());
			userCamundas.addAll(userCamundas___);

			//	employeeService.getUserInfo("aa");
*//*			Attence employee = employeeRepository.findByUuid(req.getId());

			User user = userRepository.findByUuid(employee.getUserId());
			UserInfo company = employeeService.getUserInfo(user);*//*

			CamundaOuterClass.Reply.Builder reply = CamundaOuterClass.Reply.newBuilder();

			userCamundas.stream().forEach(e->{
				reply.addCamundas(e);

			});


			responseObserver.onNext(reply.build());
			responseObserver.onCompleted();
		}*/

	@Override
	public void listCamunda(CamundaOuterClass.ListCamundaRequest req, StreamObserver<CamundaOuterClass.ListCamundaReply> responseObserver) {
		System.out.println("list service:"+req.getEmployeeId());
        System.out.println("list getPageSize:"+req.getPageSize());
        System.out.println("list getPageToken:"+req.getPageToken());

			List<CamundaOuterClass.Camunda> employeeCamundas =null;// CamundaService.listCamunda(PageRequest.of(Integer.parseInt(req.getPageToken()),req.getPageSize()));


/*
		Set<String> userCamundas___ = permissionService.queryUserCamundas(user.getId());
		userCamundas.addAll(userCamundas___);*/




			CamundaOuterClass.ListCamundaReply.Builder reply = CamundaOuterClass.ListCamundaReply.newBuilder();
			reply.addAllDuties(employeeCamundas.stream().map(e->{
				return CamundaOuterClass.Camunda.newBuilder()

						.build();
			}).collect(Collectors.toList()));


			responseObserver.onNext(reply.build());
			responseObserver.onCompleted();

	}

	@Override
	public void createCamunda(CamundaOuterClass.CreateCamundaRequest req, StreamObserver<CamundaOuterClass.Camunda> responseObserver) {
		System.out.println("createservice:"+req.getId());
		System.out.println("getEmployeeId:"+req.getId());

		try{
			Map map = req.getVariablesMap();
			HashMap route = new LinkedHashMap();

			route.put("org_id",req.getId());
			try {
				//areaGrpcClient.GetAddress("");
				TrackingOuterClass.Tracking tracking = verificationGrpcClient.createTracking(UUID.randomUUID().toString(),
						new HashMap<>(),
						new HashMap<>());
			} catch (MyBusinessException e) {
				e.printStackTrace();
			}

		//	simpleProducer.send("createCamunda",route);

			//runtimeService.startProcessInstanceByKey(req.getId(),
			//		map); //Process_0bjh5dy
			responseObserver.onNext(CamundaOuterClass.Camunda.newBuilder()
					.build());
			responseObserver.onCompleted();
		}catch (Exception e){
			Status status = Status.newBuilder()
					.setCode(Code.NOT_FOUND.getNumber())
					.setMessage(e.getMessage())
					//  .addDetails(Any.pack(registerUserResponse))
					.build();
			responseObserver.onError(StatusProto.toStatusRuntimeException(status));
		}




	}

	@Override
	public void getCamunda(CamundaOuterClass.GetCamundaRequest req, StreamObserver<CamundaOuterClass.Camunda> responseObserver) {
		System.out.println("getCamunda service getId:"+req.getId());
		Optional<CamundaOuterClass.Camunda> optionalCamunda = null;
/*
		if(req.getType().equals(CamundaOuterClass.GetCamundaRequest.RequestType.BY_ID)){
			optionalCamunda = CamundaRepository.findById(Integer.parseInt(req.getId()));
		}
		if(req.getType().equals(CamundaOuterClass.GetCamundaRequest.RequestType.BY_NAME)){
			optionalCamunda = CamundaRepository.findByCamundaName(req.getName());
		}
*/

		if(optionalCamunda.isPresent()){
		//	List<ResourceGroup> CamundaResGroupList = permissionRepository.queryResourceGroupByCamunda(req.getId());

			//Camunda Camunda = optionalCamunda.get();



			CamundaOuterClass.Camunda.Builder reply = CamundaOuterClass.Camunda.newBuilder();


			responseObserver.onNext(reply.build());
			responseObserver.onCompleted();
		}else{
			Status status = Status.newBuilder()
					.setCode(Code.NOT_FOUND.getNumber())
					.setMessage("Email or password malformed")
					//  .addDetails(Any.pack(registerUserResponse))
					.build();
			responseObserver.onError(StatusProto.toStatusRuntimeException(status));
		}
	}






	public static Timestamp fromLocalDate(LocalDateTime localDate) {
		Instant instant = localDate.toInstant(ZoneOffset.UTC);
		return Timestamp.newBuilder()
				.setSeconds(instant.getEpochSecond())
				.setNanos(instant.getNano())
				.build();
	}

	public static LocalDateTime toLocalDate(Timestamp timestamp) {
		return LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos()), ZoneId.of("UTC"))
				;
	}
}