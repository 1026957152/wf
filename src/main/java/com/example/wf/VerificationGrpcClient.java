package com.example.wf;


import camunda.CamundaServiceGrpc;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import verification.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static com.coalvalue.enumType.ScenarioTypeEnum.堆场扫_outletagency_二维码;

@Component
public class VerificationGrpcClient {




  private static final Logger LOGGER =
          LoggerFactory.getLogger(VerificationGrpcClient.class);

  @GrpcClient("verification")
  private VerificationGrpc.VerificationBlockingStub helloWorldServiceBlockingStub;
 @GrpcClient("verification")
  private AttentionServiceGrpc.AttentionServiceBlockingStub attentionServiceBlockingStub;
  @GrpcClient("verification")
  private TrackingServiceGrpc.TrackingServiceBlockingStub trackingServiceBlockingStub;

  public String CreaetVerify(String id, String key, String state) {
    VerificationOuterClass.CreateRequest person = VerificationOuterClass.CreateRequest.newBuilder().
            setId(id)
            .setType(VerificationOuterClass.VerifyType.PASSWORD)
            .setKey(key)
            .setInitialState(state)
            .build();
    LOGGER.info("client sending {}", person);


    VerificationOuterClass.VerifyReply greeting =
            helloWorldServiceBlockingStub.createVerify(person);
    LOGGER.info("client received {}", greeting);

    return greeting.getId();
  }

  public String Verify(String id) {
    VerificationOuterClass.VerifyRequest person = VerificationOuterClass.VerifyRequest.newBuilder().setId(id)
            .build();
    LOGGER.info("client sending {}", person);


    VerificationOuterClass.VerifyReply greeting =
            helloWorldServiceBlockingStub.verify(person);
    LOGGER.info("client received {}", greeting);

    return greeting.getId();
  }



  public List<VerificationOuterClass.MatteredItem> Get(String attachId) {

    VerificationOuterClass.AttachRequest person = VerificationOuterClass.AttachRequest.newBuilder()
            .setId(attachId)
            .setRequestType(VerificationOuterClass.RequestType.MATTERED_ITEM_FIND_BY_SESSION_ID)
            .build();
    LOGGER.info("client sending {}", person);


    VerificationOuterClass.AttachReply greeting =
            helloWorldServiceBlockingStub.get(person);
    LOGGER.info("client received {}", greeting);


    return greeting.getMatteredItemsList();
  }
  public boolean addToScenario(ArrayList id, String attachId) {



    VerificationOuterClass.AttachRequest person = VerificationOuterClass.AttachRequest.newBuilder()

            // .setScenario(堆场扫_outletagency_二维码.getText())
            .addAllScenarioItems(id)
            .setRequestType(VerificationOuterClass.RequestType.ADD_SCENARIO)



            .setSessionId(attachId)
            .addAllMatteredItem(id)
            .build();
    LOGGER.info("client sending {}", person);


    VerificationOuterClass.AttachReply greeting =
            helloWorldServiceBlockingStub.attach(person);
    LOGGER.info("client received {}", greeting);


    return greeting.getStatus();
  }

  public Boolean attench(String attachId, ArrayList array, ArrayList<VerificationOuterClass.ScenarioItem> array_scenario) {


    VerificationOuterClass.AttachRequest person = VerificationOuterClass.AttachRequest.newBuilder()

            .setId(attachId)
            .setRequestType(VerificationOuterClass.RequestType.SCENARIO_PAY_ATTENTION)

            .addAllScenarioItems(array_scenario)
            .addAllMatteredItem(array)
            .build();
    LOGGER.info("client sending {}", person);


    VerificationOuterClass.AttachReply greeting =
            helloWorldServiceBlockingStub.attach(person);
    LOGGER.info("client received {}", greeting);


    return greeting.getStatus();

  }

  public Attetion.ListAttentionReply listAttention(Attetion.ListAttentionRequest.RequestType byQrScan, String id, String key) throws MyBusinessException {

    Attetion.ListAttentionRequest.Builder person = Attetion.ListAttentionRequest.newBuilder();
    person.setType(byQrScan)
            .setUserId(id)
            .setScenarioId(key);
/*            .setType(byQrScan)
            .setUserId(id)
            .setScenarioId(key)
            .build();*/

    if(byQrScan.equals(Attetion.ListAttentionRequest.RequestType.BY_QR_SCAN)){

      person.setQrParameter(Attetion.ListAttentionRequest.QrParameter.newBuilder().setScenarioId(key).setUserId(id).build());
    }
    LOGGER.info("client sending {}", person);
    try {



      Attetion.ListAttentionReply greeting =
              attentionServiceBlockingStub.listAttention(person.build());
      LOGGER.info("client result {}", greeting.getAttentionsList());

      return greeting;



    }catch(StatusRuntimeException e) {
      //将异常转换为status可以得到对应的异常信息

      if (e.getStatus().getCode() == Status.Code.INTERNAL) {
        //logger.log(Level.SEVERE, e.getMessage(), e);
      }

      Status status = Status.fromThrowable(e);
      status.asException().printStackTrace();
      throw new MyBusinessException(e.getMessage(), ErrorCodeEnum.SYS_ERROR);


    }

  }

  public Attetion.Attention PayAttention(String userId, String id, String delivery_order, String id1, String scenc) throws MyBusinessException {

    Attetion.CreateAttentionRequest person = Attetion.CreateAttentionRequest.newBuilder()

            .setUserId(userId)
            .setReferenceId(id)
            .setReferenceType(delivery_order)
            .setScenarioId(id1)
            .setScenarioType(scenc)
            .build();
    LOGGER.info("client sending {}", person);
    try {



      Attetion.Attention greeting =
              attentionServiceBlockingStub.payAttention(person);
      LOGGER.info("client result {}");

      return greeting;



    }catch(StatusRuntimeException e) {
      //将异常转换为status可以得到对应的异常信息

      if (e.getStatus().getCode() == Status.Code.INTERNAL) {
        //logger.log(Level.SEVERE, e.getMessage(), e);
      }

      Status status = Status.fromThrowable(e);
      status.asException().printStackTrace();
      throw new MyBusinessException(e.getMessage(), ErrorCodeEnum.SYS_ERROR);


    }

  }

  public VerificationOuterClass.AttachReply addMatter(String id, ArrayList array) {


    VerificationOuterClass.AttachRequest person = VerificationOuterClass.AttachRequest.newBuilder()
            .setId(id)
            .setRequestType(VerificationOuterClass.RequestType.ADD_MATTERED_ITEM)
            .addAllMatteredItem(array)
            .build();
    LOGGER.info("client sending {}", person);


    VerificationOuterClass.AttachReply greeting =
            helloWorldServiceBlockingStub.attach(person);
    LOGGER.info("client received {}", greeting);


    return greeting;


  }


  Map<String,ArrayList<VerificationOuterClass.MatteredItem>> map = new HashMap<String,ArrayList<VerificationOuterClass.MatteredItem>>();
  public String addTempMatter(String toString, ArrayList array) {
    map.put(toString,array);
    return toString;
  }

  public ArrayList getTempMatter(String toString) {
    return map.get(toString);

  }

  public VerificationOuterClass.HasReply Has(String id,String type) throws MyBusinessException {
    VerificationOuterClass.HasRequest person = VerificationOuterClass.HasRequest.newBuilder()

            .setId(id)
            .setType(type)

            .build();
    LOGGER.info("client sending {}", person);
    try {



      VerificationOuterClass.HasReply greeting =
              helloWorldServiceBlockingStub.has(person);
      LOGGER.info("client result {}");

      return greeting;



    }catch(StatusRuntimeException e) {
      //将异常转换为status可以得到对应的异常信息

      if (e.getStatus().getCode() == Status.Code.INTERNAL) {
        //logger.log(Level.SEVERE, e.getMessage(), e);
      }

      Status status = Status.fromThrowable(e);
      status.asException().printStackTrace();
      throw new MyBusinessException(e.getMessage(), ErrorCodeEnum.SYS_ERROR);


    }

  }













  public TrackingOuterClass.Tracking createTracking(String id, Map<String,String> todo, Map<String,String> track) throws MyBusinessException {

    TrackingOuterClass.CreateTrackingRequest person = TrackingOuterClass.CreateTrackingRequest.newBuilder()

            .setId(id)
            .putAllTodoMap(todo)
            .putAllTrackMap(track)

            .build();
    LOGGER.info("client sending {}", person);
    try {



      TrackingOuterClass.Tracking greeting =
              trackingServiceBlockingStub.createTracking(person);
      LOGGER.info("client result {}");

      return greeting;



    }catch(StatusRuntimeException e) {
      //将异常转换为status可以得到对应的异常信息

      if (e.getStatus().getCode() == Status.Code.INTERNAL) {
        //logger.log(Level.SEVERE, e.getMessage(), e);
      }

      Status status = Status.fromThrowable(e);
      status.asException().printStackTrace();
      throw new MyBusinessException(e.getMessage(), ErrorCodeEnum.SYS_ERROR);


    }

  }

  public TrackingOuterClass.Tracking getTracking(String id) throws MyBusinessException {

    TrackingOuterClass.GetTrackingRequest person = TrackingOuterClass.GetTrackingRequest.newBuilder()

            .setId(id)


            .build();
    LOGGER.info("client sending {}", person);
    try {



      TrackingOuterClass.Tracking greeting =
              trackingServiceBlockingStub.getTracking(person);
      LOGGER.info("client result {}");

      return greeting;



    }catch(StatusRuntimeException e) {
      //将异常转换为status可以得到对应的异常信息

      if (e.getStatus().getCode() == Status.Code.INTERNAL) {
        //logger.log(Level.SEVERE, e.getMessage(), e);
      }

      Status status = Status.fromThrowable(e);
      status.asException().printStackTrace();
      throw new MyBusinessException(e.getMessage(), ErrorCodeEnum.SYS_ERROR);


    }

  }


  public Attetion.Attention CancelAttention(String userId, String id, String delivery_order, String id1, String scenc) throws MyBusinessException {

    Attetion.CancelAttentionRequest person = Attetion.CancelAttentionRequest.newBuilder()
            .setUserId(userId)
            .setReferenceId(id)
            .setReferenceType(delivery_order)
            .setScenarioId(id1)
            .setScenarioType(scenc)
            .build();
    LOGGER.info("client sending {}", person);
    try {



      Attetion.Attention greeting =
              attentionServiceBlockingStub.cancelAttention(person);
      LOGGER.info("client result {}");

      return greeting;



    }catch(StatusRuntimeException e) {
      //将异常转换为status可以得到对应的异常信息

      if (e.getStatus().getCode() == Status.Code.INTERNAL) {
        //logger.log(Level.SEVERE, e.getMessage(), e);
      }

      Status status = Status.fromThrowable(e);
      status.asException().printStackTrace();
      throw new MyBusinessException(e.getMessage(), ErrorCodeEnum.SYS_ERROR);


    }

  }

}