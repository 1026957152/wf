package camunda;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: camunda.proto")
public final class CamundaServiceGrpc {

  private CamundaServiceGrpc() {}

  public static final String SERVICE_NAME = "camunda.CamundaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<camunda.CamundaOuterClass.CreateCamundaRequest,
      camunda.CamundaOuterClass.Camunda> getCreateCamundaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCamunda",
      requestType = camunda.CamundaOuterClass.CreateCamundaRequest.class,
      responseType = camunda.CamundaOuterClass.Camunda.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.CamundaOuterClass.CreateCamundaRequest,
      camunda.CamundaOuterClass.Camunda> getCreateCamundaMethod() {
    io.grpc.MethodDescriptor<camunda.CamundaOuterClass.CreateCamundaRequest, camunda.CamundaOuterClass.Camunda> getCreateCamundaMethod;
    if ((getCreateCamundaMethod = CamundaServiceGrpc.getCreateCamundaMethod) == null) {
      synchronized (CamundaServiceGrpc.class) {
        if ((getCreateCamundaMethod = CamundaServiceGrpc.getCreateCamundaMethod) == null) {
          CamundaServiceGrpc.getCreateCamundaMethod = getCreateCamundaMethod = 
              io.grpc.MethodDescriptor.<camunda.CamundaOuterClass.CreateCamundaRequest, camunda.CamundaOuterClass.Camunda>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.CamundaService", "CreateCamunda"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.CreateCamundaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.Camunda.getDefaultInstance()))
                  .setSchemaDescriptor(new CamundaServiceMethodDescriptorSupplier("CreateCamunda"))
                  .build();
          }
        }
     }
     return getCreateCamundaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.CamundaOuterClass.ListCamundaRequest,
      camunda.CamundaOuterClass.ListCamundaReply> getListCamundaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCamunda",
      requestType = camunda.CamundaOuterClass.ListCamundaRequest.class,
      responseType = camunda.CamundaOuterClass.ListCamundaReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.CamundaOuterClass.ListCamundaRequest,
      camunda.CamundaOuterClass.ListCamundaReply> getListCamundaMethod() {
    io.grpc.MethodDescriptor<camunda.CamundaOuterClass.ListCamundaRequest, camunda.CamundaOuterClass.ListCamundaReply> getListCamundaMethod;
    if ((getListCamundaMethod = CamundaServiceGrpc.getListCamundaMethod) == null) {
      synchronized (CamundaServiceGrpc.class) {
        if ((getListCamundaMethod = CamundaServiceGrpc.getListCamundaMethod) == null) {
          CamundaServiceGrpc.getListCamundaMethod = getListCamundaMethod = 
              io.grpc.MethodDescriptor.<camunda.CamundaOuterClass.ListCamundaRequest, camunda.CamundaOuterClass.ListCamundaReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.CamundaService", "ListCamunda"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.ListCamundaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.ListCamundaReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CamundaServiceMethodDescriptorSupplier("ListCamunda"))
                  .build();
          }
        }
     }
     return getListCamundaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.CamundaOuterClass.GetCamundaRequest,
      camunda.CamundaOuterClass.Camunda> getGetCamundaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCamunda",
      requestType = camunda.CamundaOuterClass.GetCamundaRequest.class,
      responseType = camunda.CamundaOuterClass.Camunda.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.CamundaOuterClass.GetCamundaRequest,
      camunda.CamundaOuterClass.Camunda> getGetCamundaMethod() {
    io.grpc.MethodDescriptor<camunda.CamundaOuterClass.GetCamundaRequest, camunda.CamundaOuterClass.Camunda> getGetCamundaMethod;
    if ((getGetCamundaMethod = CamundaServiceGrpc.getGetCamundaMethod) == null) {
      synchronized (CamundaServiceGrpc.class) {
        if ((getGetCamundaMethod = CamundaServiceGrpc.getGetCamundaMethod) == null) {
          CamundaServiceGrpc.getGetCamundaMethod = getGetCamundaMethod = 
              io.grpc.MethodDescriptor.<camunda.CamundaOuterClass.GetCamundaRequest, camunda.CamundaOuterClass.Camunda>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.CamundaService", "GetCamunda"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.GetCamundaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.Camunda.getDefaultInstance()))
                  .setSchemaDescriptor(new CamundaServiceMethodDescriptorSupplier("GetCamunda"))
                  .build();
          }
        }
     }
     return getGetCamundaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.CamundaOuterClass.OnCamundaRequest,
      camunda.CamundaOuterClass.Camunda> getOnCamundaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnCamunda",
      requestType = camunda.CamundaOuterClass.OnCamundaRequest.class,
      responseType = camunda.CamundaOuterClass.Camunda.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.CamundaOuterClass.OnCamundaRequest,
      camunda.CamundaOuterClass.Camunda> getOnCamundaMethod() {
    io.grpc.MethodDescriptor<camunda.CamundaOuterClass.OnCamundaRequest, camunda.CamundaOuterClass.Camunda> getOnCamundaMethod;
    if ((getOnCamundaMethod = CamundaServiceGrpc.getOnCamundaMethod) == null) {
      synchronized (CamundaServiceGrpc.class) {
        if ((getOnCamundaMethod = CamundaServiceGrpc.getOnCamundaMethod) == null) {
          CamundaServiceGrpc.getOnCamundaMethod = getOnCamundaMethod = 
              io.grpc.MethodDescriptor.<camunda.CamundaOuterClass.OnCamundaRequest, camunda.CamundaOuterClass.Camunda>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.CamundaService", "OnCamunda"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.OnCamundaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.CamundaOuterClass.Camunda.getDefaultInstance()))
                  .setSchemaDescriptor(new CamundaServiceMethodDescriptorSupplier("OnCamunda"))
                  .build();
          }
        }
     }
     return getOnCamundaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CamundaServiceStub newStub(io.grpc.Channel channel) {
    return new CamundaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CamundaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CamundaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CamundaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CamundaServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class CamundaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCamunda(camunda.CamundaOuterClass.CreateCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCamundaMethod(), responseObserver);
    }

    /**
     */
    public void listCamunda(camunda.CamundaOuterClass.ListCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.ListCamundaReply> responseObserver) {
      asyncUnimplementedUnaryCall(getListCamundaMethod(), responseObserver);
    }

    /**
     */
    public void getCamunda(camunda.CamundaOuterClass.GetCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCamundaMethod(), responseObserver);
    }

    /**
     */
    public void onCamunda(camunda.CamundaOuterClass.OnCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda> responseObserver) {
      asyncUnimplementedUnaryCall(getOnCamundaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCamundaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.CamundaOuterClass.CreateCamundaRequest,
                camunda.CamundaOuterClass.Camunda>(
                  this, METHODID_CREATE_CAMUNDA)))
          .addMethod(
            getListCamundaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.CamundaOuterClass.ListCamundaRequest,
                camunda.CamundaOuterClass.ListCamundaReply>(
                  this, METHODID_LIST_CAMUNDA)))
          .addMethod(
            getGetCamundaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.CamundaOuterClass.GetCamundaRequest,
                camunda.CamundaOuterClass.Camunda>(
                  this, METHODID_GET_CAMUNDA)))
          .addMethod(
            getOnCamundaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.CamundaOuterClass.OnCamundaRequest,
                camunda.CamundaOuterClass.Camunda>(
                  this, METHODID_ON_CAMUNDA)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CamundaServiceStub extends io.grpc.stub.AbstractStub<CamundaServiceStub> {
    private CamundaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CamundaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CamundaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CamundaServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCamunda(camunda.CamundaOuterClass.CreateCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCamundaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCamunda(camunda.CamundaOuterClass.ListCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.ListCamundaReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCamundaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCamunda(camunda.CamundaOuterClass.GetCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCamundaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onCamunda(camunda.CamundaOuterClass.OnCamundaRequest request,
        io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnCamundaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CamundaServiceBlockingStub extends io.grpc.stub.AbstractStub<CamundaServiceBlockingStub> {
    private CamundaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CamundaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CamundaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CamundaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public camunda.CamundaOuterClass.Camunda createCamunda(camunda.CamundaOuterClass.CreateCamundaRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCamundaMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.CamundaOuterClass.ListCamundaReply listCamunda(camunda.CamundaOuterClass.ListCamundaRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCamundaMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.CamundaOuterClass.Camunda getCamunda(camunda.CamundaOuterClass.GetCamundaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCamundaMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.CamundaOuterClass.Camunda onCamunda(camunda.CamundaOuterClass.OnCamundaRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnCamundaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CamundaServiceFutureStub extends io.grpc.stub.AbstractStub<CamundaServiceFutureStub> {
    private CamundaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CamundaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CamundaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CamundaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.CamundaOuterClass.Camunda> createCamunda(
        camunda.CamundaOuterClass.CreateCamundaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCamundaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.CamundaOuterClass.ListCamundaReply> listCamunda(
        camunda.CamundaOuterClass.ListCamundaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCamundaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.CamundaOuterClass.Camunda> getCamunda(
        camunda.CamundaOuterClass.GetCamundaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCamundaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.CamundaOuterClass.Camunda> onCamunda(
        camunda.CamundaOuterClass.OnCamundaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnCamundaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CAMUNDA = 0;
  private static final int METHODID_LIST_CAMUNDA = 1;
  private static final int METHODID_GET_CAMUNDA = 2;
  private static final int METHODID_ON_CAMUNDA = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CamundaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CamundaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CAMUNDA:
          serviceImpl.createCamunda((camunda.CamundaOuterClass.CreateCamundaRequest) request,
              (io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda>) responseObserver);
          break;
        case METHODID_LIST_CAMUNDA:
          serviceImpl.listCamunda((camunda.CamundaOuterClass.ListCamundaRequest) request,
              (io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.ListCamundaReply>) responseObserver);
          break;
        case METHODID_GET_CAMUNDA:
          serviceImpl.getCamunda((camunda.CamundaOuterClass.GetCamundaRequest) request,
              (io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda>) responseObserver);
          break;
        case METHODID_ON_CAMUNDA:
          serviceImpl.onCamunda((camunda.CamundaOuterClass.OnCamundaRequest) request,
              (io.grpc.stub.StreamObserver<camunda.CamundaOuterClass.Camunda>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CamundaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CamundaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return camunda.CamundaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CamundaService");
    }
  }

  private static final class CamundaServiceFileDescriptorSupplier
      extends CamundaServiceBaseDescriptorSupplier {
    CamundaServiceFileDescriptorSupplier() {}
  }

  private static final class CamundaServiceMethodDescriptorSupplier
      extends CamundaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CamundaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CamundaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CamundaServiceFileDescriptorSupplier())
              .addMethod(getCreateCamundaMethod())
              .addMethod(getListCamundaMethod())
              .addMethod(getGetCamundaMethod())
              .addMethod(getOnCamundaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
