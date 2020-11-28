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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: attetion.proto")
public final class AttentionServiceGrpc {

  private AttentionServiceGrpc() {}

  public static final String SERVICE_NAME = "verification.AttentionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<verification.Attetion.CreateAttentionRequest,
      verification.Attetion.Attention> getPayAttentionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayAttention",
      requestType = verification.Attetion.CreateAttentionRequest.class,
      responseType = verification.Attetion.Attention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.Attetion.CreateAttentionRequest,
      verification.Attetion.Attention> getPayAttentionMethod() {
    io.grpc.MethodDescriptor<verification.Attetion.CreateAttentionRequest, verification.Attetion.Attention> getPayAttentionMethod;
    if ((getPayAttentionMethod = AttentionServiceGrpc.getPayAttentionMethod) == null) {
      synchronized (AttentionServiceGrpc.class) {
        if ((getPayAttentionMethod = AttentionServiceGrpc.getPayAttentionMethod) == null) {
          AttentionServiceGrpc.getPayAttentionMethod = getPayAttentionMethod = 
              io.grpc.MethodDescriptor.<verification.Attetion.CreateAttentionRequest, verification.Attetion.Attention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.AttentionService", "PayAttention"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.CreateAttentionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.Attention.getDefaultInstance()))
                  .setSchemaDescriptor(new AttentionServiceMethodDescriptorSupplier("PayAttention"))
                  .build();
          }
        }
     }
     return getPayAttentionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.Attetion.ListAttentionRequest,
      verification.Attetion.ListAttentionReply> getListAttentionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAttention",
      requestType = verification.Attetion.ListAttentionRequest.class,
      responseType = verification.Attetion.ListAttentionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.Attetion.ListAttentionRequest,
      verification.Attetion.ListAttentionReply> getListAttentionMethod() {
    io.grpc.MethodDescriptor<verification.Attetion.ListAttentionRequest, verification.Attetion.ListAttentionReply> getListAttentionMethod;
    if ((getListAttentionMethod = AttentionServiceGrpc.getListAttentionMethod) == null) {
      synchronized (AttentionServiceGrpc.class) {
        if ((getListAttentionMethod = AttentionServiceGrpc.getListAttentionMethod) == null) {
          AttentionServiceGrpc.getListAttentionMethod = getListAttentionMethod = 
              io.grpc.MethodDescriptor.<verification.Attetion.ListAttentionRequest, verification.Attetion.ListAttentionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.AttentionService", "ListAttention"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.ListAttentionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.ListAttentionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AttentionServiceMethodDescriptorSupplier("ListAttention"))
                  .build();
          }
        }
     }
     return getListAttentionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.Attetion.UpdateAttentionRequest,
      verification.Attetion.Attention> getUpdateAttentionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAttention",
      requestType = verification.Attetion.UpdateAttentionRequest.class,
      responseType = verification.Attetion.Attention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.Attetion.UpdateAttentionRequest,
      verification.Attetion.Attention> getUpdateAttentionMethod() {
    io.grpc.MethodDescriptor<verification.Attetion.UpdateAttentionRequest, verification.Attetion.Attention> getUpdateAttentionMethod;
    if ((getUpdateAttentionMethod = AttentionServiceGrpc.getUpdateAttentionMethod) == null) {
      synchronized (AttentionServiceGrpc.class) {
        if ((getUpdateAttentionMethod = AttentionServiceGrpc.getUpdateAttentionMethod) == null) {
          AttentionServiceGrpc.getUpdateAttentionMethod = getUpdateAttentionMethod = 
              io.grpc.MethodDescriptor.<verification.Attetion.UpdateAttentionRequest, verification.Attetion.Attention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.AttentionService", "UpdateAttention"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.UpdateAttentionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.Attention.getDefaultInstance()))
                  .setSchemaDescriptor(new AttentionServiceMethodDescriptorSupplier("UpdateAttention"))
                  .build();
          }
        }
     }
     return getUpdateAttentionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.Attetion.CancelAttentionRequest,
      verification.Attetion.Attention> getCancelAttentionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAttention",
      requestType = verification.Attetion.CancelAttentionRequest.class,
      responseType = verification.Attetion.Attention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.Attetion.CancelAttentionRequest,
      verification.Attetion.Attention> getCancelAttentionMethod() {
    io.grpc.MethodDescriptor<verification.Attetion.CancelAttentionRequest, verification.Attetion.Attention> getCancelAttentionMethod;
    if ((getCancelAttentionMethod = AttentionServiceGrpc.getCancelAttentionMethod) == null) {
      synchronized (AttentionServiceGrpc.class) {
        if ((getCancelAttentionMethod = AttentionServiceGrpc.getCancelAttentionMethod) == null) {
          AttentionServiceGrpc.getCancelAttentionMethod = getCancelAttentionMethod = 
              io.grpc.MethodDescriptor.<verification.Attetion.CancelAttentionRequest, verification.Attetion.Attention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.AttentionService", "CancelAttention"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.CancelAttentionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.Attetion.Attention.getDefaultInstance()))
                  .setSchemaDescriptor(new AttentionServiceMethodDescriptorSupplier("CancelAttention"))
                  .build();
          }
        }
     }
     return getCancelAttentionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AttentionServiceStub newStub(io.grpc.Channel channel) {
    return new AttentionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AttentionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AttentionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AttentionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AttentionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class AttentionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void payAttention(verification.Attetion.CreateAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.Attention> responseObserver) {
      asyncUnimplementedUnaryCall(getPayAttentionMethod(), responseObserver);
    }

    /**
     */
    public void listAttention(verification.Attetion.ListAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.ListAttentionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getListAttentionMethod(), responseObserver);
    }

    /**
     */
    public void updateAttention(verification.Attetion.UpdateAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.Attention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAttentionMethod(), responseObserver);
    }

    /**
     */
    public void cancelAttention(verification.Attetion.CancelAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.Attention> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelAttentionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPayAttentionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.Attetion.CreateAttentionRequest,
                verification.Attetion.Attention>(
                  this, METHODID_PAY_ATTENTION)))
          .addMethod(
            getListAttentionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.Attetion.ListAttentionRequest,
                verification.Attetion.ListAttentionReply>(
                  this, METHODID_LIST_ATTENTION)))
          .addMethod(
            getUpdateAttentionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.Attetion.UpdateAttentionRequest,
                verification.Attetion.Attention>(
                  this, METHODID_UPDATE_ATTENTION)))
          .addMethod(
            getCancelAttentionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.Attetion.CancelAttentionRequest,
                verification.Attetion.Attention>(
                  this, METHODID_CANCEL_ATTENTION)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AttentionServiceStub extends io.grpc.stub.AbstractStub<AttentionServiceStub> {
    private AttentionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AttentionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttentionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AttentionServiceStub(channel, callOptions);
    }

    /**
     */
    public void payAttention(verification.Attetion.CreateAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.Attention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayAttentionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAttention(verification.Attetion.ListAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.ListAttentionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAttentionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAttention(verification.Attetion.UpdateAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.Attention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAttentionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelAttention(verification.Attetion.CancelAttentionRequest request,
        io.grpc.stub.StreamObserver<verification.Attetion.Attention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelAttentionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AttentionServiceBlockingStub extends io.grpc.stub.AbstractStub<AttentionServiceBlockingStub> {
    private AttentionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AttentionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttentionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AttentionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public verification.Attetion.Attention payAttention(verification.Attetion.CreateAttentionRequest request) {
      return blockingUnaryCall(
          getChannel(), getPayAttentionMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.Attetion.ListAttentionReply listAttention(verification.Attetion.ListAttentionRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAttentionMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.Attetion.Attention updateAttention(verification.Attetion.UpdateAttentionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAttentionMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.Attetion.Attention cancelAttention(verification.Attetion.CancelAttentionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelAttentionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AttentionServiceFutureStub extends io.grpc.stub.AbstractStub<AttentionServiceFutureStub> {
    private AttentionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AttentionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttentionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AttentionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.Attetion.Attention> payAttention(
        verification.Attetion.CreateAttentionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPayAttentionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.Attetion.ListAttentionReply> listAttention(
        verification.Attetion.ListAttentionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAttentionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.Attetion.Attention> updateAttention(
        verification.Attetion.UpdateAttentionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAttentionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.Attetion.Attention> cancelAttention(
        verification.Attetion.CancelAttentionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelAttentionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAY_ATTENTION = 0;
  private static final int METHODID_LIST_ATTENTION = 1;
  private static final int METHODID_UPDATE_ATTENTION = 2;
  private static final int METHODID_CANCEL_ATTENTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AttentionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AttentionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAY_ATTENTION:
          serviceImpl.payAttention((verification.Attetion.CreateAttentionRequest) request,
              (io.grpc.stub.StreamObserver<verification.Attetion.Attention>) responseObserver);
          break;
        case METHODID_LIST_ATTENTION:
          serviceImpl.listAttention((verification.Attetion.ListAttentionRequest) request,
              (io.grpc.stub.StreamObserver<verification.Attetion.ListAttentionReply>) responseObserver);
          break;
        case METHODID_UPDATE_ATTENTION:
          serviceImpl.updateAttention((verification.Attetion.UpdateAttentionRequest) request,
              (io.grpc.stub.StreamObserver<verification.Attetion.Attention>) responseObserver);
          break;
        case METHODID_CANCEL_ATTENTION:
          serviceImpl.cancelAttention((verification.Attetion.CancelAttentionRequest) request,
              (io.grpc.stub.StreamObserver<verification.Attetion.Attention>) responseObserver);
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

  private static abstract class AttentionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AttentionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return verification.Attetion.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AttentionService");
    }
  }

  private static final class AttentionServiceFileDescriptorSupplier
      extends AttentionServiceBaseDescriptorSupplier {
    AttentionServiceFileDescriptorSupplier() {}
  }

  private static final class AttentionServiceMethodDescriptorSupplier
      extends AttentionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AttentionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AttentionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AttentionServiceFileDescriptorSupplier())
              .addMethod(getPayAttentionMethod())
              .addMethod(getListAttentionMethod())
              .addMethod(getUpdateAttentionMethod())
              .addMethod(getCancelAttentionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
