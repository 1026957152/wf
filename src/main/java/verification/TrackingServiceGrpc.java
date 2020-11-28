package verification;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: tracking.proto")
public final class TrackingServiceGrpc {

  private TrackingServiceGrpc() {}

  public static final String SERVICE_NAME = "verification.TrackingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<verification.TrackingOuterClass.CreateTrackingRequest,
      verification.TrackingOuterClass.Tracking> getCreateTrackingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTracking",
      requestType = verification.TrackingOuterClass.CreateTrackingRequest.class,
      responseType = verification.TrackingOuterClass.Tracking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.TrackingOuterClass.CreateTrackingRequest,
      verification.TrackingOuterClass.Tracking> getCreateTrackingMethod() {
    io.grpc.MethodDescriptor<verification.TrackingOuterClass.CreateTrackingRequest, verification.TrackingOuterClass.Tracking> getCreateTrackingMethod;
    if ((getCreateTrackingMethod = TrackingServiceGrpc.getCreateTrackingMethod) == null) {
      synchronized (TrackingServiceGrpc.class) {
        if ((getCreateTrackingMethod = TrackingServiceGrpc.getCreateTrackingMethod) == null) {
          TrackingServiceGrpc.getCreateTrackingMethod = getCreateTrackingMethod = 
              io.grpc.MethodDescriptor.<verification.TrackingOuterClass.CreateTrackingRequest, verification.TrackingOuterClass.Tracking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.TrackingService", "CreateTracking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.TrackingOuterClass.CreateTrackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.TrackingOuterClass.Tracking.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackingServiceMethodDescriptorSupplier("CreateTracking"))
                  .build();
          }
        }
     }
     return getCreateTrackingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.TrackingOuterClass.GetTrackingRequest,
      verification.TrackingOuterClass.Tracking> getGetTrackingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTracking",
      requestType = verification.TrackingOuterClass.GetTrackingRequest.class,
      responseType = verification.TrackingOuterClass.Tracking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.TrackingOuterClass.GetTrackingRequest,
      verification.TrackingOuterClass.Tracking> getGetTrackingMethod() {
    io.grpc.MethodDescriptor<verification.TrackingOuterClass.GetTrackingRequest, verification.TrackingOuterClass.Tracking> getGetTrackingMethod;
    if ((getGetTrackingMethod = TrackingServiceGrpc.getGetTrackingMethod) == null) {
      synchronized (TrackingServiceGrpc.class) {
        if ((getGetTrackingMethod = TrackingServiceGrpc.getGetTrackingMethod) == null) {
          TrackingServiceGrpc.getGetTrackingMethod = getGetTrackingMethod = 
              io.grpc.MethodDescriptor.<verification.TrackingOuterClass.GetTrackingRequest, verification.TrackingOuterClass.Tracking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.TrackingService", "GetTracking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.TrackingOuterClass.GetTrackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.TrackingOuterClass.Tracking.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackingServiceMethodDescriptorSupplier("GetTracking"))
                  .build();
          }
        }
     }
     return getGetTrackingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrackingServiceStub newStub(io.grpc.Channel channel) {
    return new TrackingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrackingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrackingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrackingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrackingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TrackingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTracking(verification.TrackingOuterClass.CreateTrackingRequest request,
        io.grpc.stub.StreamObserver<verification.TrackingOuterClass.Tracking> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTrackingMethod(), responseObserver);
    }

    /**
     */
    public void getTracking(verification.TrackingOuterClass.GetTrackingRequest request,
        io.grpc.stub.StreamObserver<verification.TrackingOuterClass.Tracking> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTrackingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTrackingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.TrackingOuterClass.CreateTrackingRequest,
                verification.TrackingOuterClass.Tracking>(
                  this, METHODID_CREATE_TRACKING)))
          .addMethod(
            getGetTrackingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.TrackingOuterClass.GetTrackingRequest,
                verification.TrackingOuterClass.Tracking>(
                  this, METHODID_GET_TRACKING)))
          .build();
    }
  }

  /**
   */
  public static final class TrackingServiceStub extends io.grpc.stub.AbstractStub<TrackingServiceStub> {
    private TrackingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTracking(verification.TrackingOuterClass.CreateTrackingRequest request,
        io.grpc.stub.StreamObserver<verification.TrackingOuterClass.Tracking> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTrackingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTracking(verification.TrackingOuterClass.GetTrackingRequest request,
        io.grpc.stub.StreamObserver<verification.TrackingOuterClass.Tracking> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTrackingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrackingServiceBlockingStub extends io.grpc.stub.AbstractStub<TrackingServiceBlockingStub> {
    private TrackingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public verification.TrackingOuterClass.Tracking createTracking(verification.TrackingOuterClass.CreateTrackingRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTrackingMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.TrackingOuterClass.Tracking getTracking(verification.TrackingOuterClass.GetTrackingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTrackingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrackingServiceFutureStub extends io.grpc.stub.AbstractStub<TrackingServiceFutureStub> {
    private TrackingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.TrackingOuterClass.Tracking> createTracking(
        verification.TrackingOuterClass.CreateTrackingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTrackingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.TrackingOuterClass.Tracking> getTracking(
        verification.TrackingOuterClass.GetTrackingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTrackingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRACKING = 0;
  private static final int METHODID_GET_TRACKING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrackingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrackingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TRACKING:
          serviceImpl.createTracking((verification.TrackingOuterClass.CreateTrackingRequest) request,
              (io.grpc.stub.StreamObserver<verification.TrackingOuterClass.Tracking>) responseObserver);
          break;
        case METHODID_GET_TRACKING:
          serviceImpl.getTracking((verification.TrackingOuterClass.GetTrackingRequest) request,
              (io.grpc.stub.StreamObserver<verification.TrackingOuterClass.Tracking>) responseObserver);
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

  private static abstract class TrackingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrackingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return verification.TrackingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrackingService");
    }
  }

  private static final class TrackingServiceFileDescriptorSupplier
      extends TrackingServiceBaseDescriptorSupplier {
    TrackingServiceFileDescriptorSupplier() {}
  }

  private static final class TrackingServiceMethodDescriptorSupplier
      extends TrackingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrackingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrackingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrackingServiceFileDescriptorSupplier())
              .addMethod(getCreateTrackingMethod())
              .addMethod(getGetTrackingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
