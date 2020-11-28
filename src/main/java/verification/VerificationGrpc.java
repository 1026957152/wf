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
    comments = "Source: verification.proto")
public final class VerificationGrpc {

  private VerificationGrpc() {}

  public static final String SERVICE_NAME = "verification.Verification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.CreateRequest,
      verification.VerificationOuterClass.VerifyReply> getCreateVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVerify",
      requestType = verification.VerificationOuterClass.CreateRequest.class,
      responseType = verification.VerificationOuterClass.VerifyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.CreateRequest,
      verification.VerificationOuterClass.VerifyReply> getCreateVerifyMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.CreateRequest, verification.VerificationOuterClass.VerifyReply> getCreateVerifyMethod;
    if ((getCreateVerifyMethod = VerificationGrpc.getCreateVerifyMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getCreateVerifyMethod = VerificationGrpc.getCreateVerifyMethod) == null) {
          VerificationGrpc.getCreateVerifyMethod = getCreateVerifyMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.CreateRequest, verification.VerificationOuterClass.VerifyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "CreateVerify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.VerifyReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("CreateVerify"))
                  .build();
          }
        }
     }
     return getCreateVerifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.VerifyRequest,
      verification.VerificationOuterClass.VerifyReply> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Verify",
      requestType = verification.VerificationOuterClass.VerifyRequest.class,
      responseType = verification.VerificationOuterClass.VerifyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.VerifyRequest,
      verification.VerificationOuterClass.VerifyReply> getVerifyMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.VerifyRequest, verification.VerificationOuterClass.VerifyReply> getVerifyMethod;
    if ((getVerifyMethod = VerificationGrpc.getVerifyMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getVerifyMethod = VerificationGrpc.getVerifyMethod) == null) {
          VerificationGrpc.getVerifyMethod = getVerifyMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.VerifyRequest, verification.VerificationOuterClass.VerifyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.VerifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.VerifyReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Verify"))
                  .build();
          }
        }
     }
     return getVerifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attach",
      requestType = verification.VerificationOuterClass.AttachRequest.class,
      responseType = verification.VerificationOuterClass.AttachReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getAttachMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply> getAttachMethod;
    if ((getAttachMethod = VerificationGrpc.getAttachMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getAttachMethod = VerificationGrpc.getAttachMethod) == null) {
          VerificationGrpc.getAttachMethod = getAttachMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Attach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Attach"))
                  .build();
          }
        }
     }
     return getAttachMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getGetAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAttach",
      requestType = verification.VerificationOuterClass.AttachRequest.class,
      responseType = verification.VerificationOuterClass.AttachReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getGetAttachMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply> getGetAttachMethod;
    if ((getGetAttachMethod = VerificationGrpc.getGetAttachMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getGetAttachMethod = VerificationGrpc.getGetAttachMethod) == null) {
          VerificationGrpc.getGetAttachMethod = getGetAttachMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "GetAttach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("GetAttach"))
                  .build();
          }
        }
     }
     return getGetAttachMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Session",
      requestType = verification.VerificationOuterClass.AttachRequest.class,
      responseType = verification.VerificationOuterClass.AttachReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getSessionMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply> getSessionMethod;
    if ((getSessionMethod = VerificationGrpc.getSessionMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getSessionMethod = VerificationGrpc.getSessionMethod) == null) {
          VerificationGrpc.getSessionMethod = getSessionMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Session"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Session"))
                  .build();
          }
        }
     }
     return getSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.InviteRequest,
      verification.VerificationOuterClass.InviteReply> getInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Invite",
      requestType = verification.VerificationOuterClass.InviteRequest.class,
      responseType = verification.VerificationOuterClass.InviteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.InviteRequest,
      verification.VerificationOuterClass.InviteReply> getInviteMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.InviteRequest, verification.VerificationOuterClass.InviteReply> getInviteMethod;
    if ((getInviteMethod = VerificationGrpc.getInviteMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getInviteMethod = VerificationGrpc.getInviteMethod) == null) {
          VerificationGrpc.getInviteMethod = getInviteMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.InviteRequest, verification.VerificationOuterClass.InviteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Invite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.InviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.InviteReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Invite"))
                  .build();
          }
        }
     }
     return getInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = verification.VerificationOuterClass.AttachRequest.class,
      responseType = verification.VerificationOuterClass.AttachReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getGetMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply> getGetMethod;
    if ((getGetMethod = VerificationGrpc.getGetMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getGetMethod = VerificationGrpc.getGetMethod) == null) {
          VerificationGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = verification.VerificationOuterClass.AttachRequest.class,
      responseType = verification.VerificationOuterClass.AttachReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest,
      verification.VerificationOuterClass.AttachReply> getStatusMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply> getStatusMethod;
    if ((getStatusMethod = VerificationGrpc.getStatusMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getStatusMethod = VerificationGrpc.getStatusMethod) == null) {
          VerificationGrpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.AttachRequest, verification.VerificationOuterClass.AttachReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.AttachReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<verification.VerificationOuterClass.HasRequest,
      verification.VerificationOuterClass.HasReply> getHasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Has",
      requestType = verification.VerificationOuterClass.HasRequest.class,
      responseType = verification.VerificationOuterClass.HasReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<verification.VerificationOuterClass.HasRequest,
      verification.VerificationOuterClass.HasReply> getHasMethod() {
    io.grpc.MethodDescriptor<verification.VerificationOuterClass.HasRequest, verification.VerificationOuterClass.HasReply> getHasMethod;
    if ((getHasMethod = VerificationGrpc.getHasMethod) == null) {
      synchronized (VerificationGrpc.class) {
        if ((getHasMethod = VerificationGrpc.getHasMethod) == null) {
          VerificationGrpc.getHasMethod = getHasMethod = 
              io.grpc.MethodDescriptor.<verification.VerificationOuterClass.HasRequest, verification.VerificationOuterClass.HasReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "verification.Verification", "Has"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.HasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verification.VerificationOuterClass.HasReply.getDefaultInstance()))
                  .setSchemaDescriptor(new VerificationMethodDescriptorSupplier("Has"))
                  .build();
          }
        }
     }
     return getHasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VerificationStub newStub(io.grpc.Channel channel) {
    return new VerificationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VerificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VerificationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VerificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VerificationFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class VerificationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void createVerify(verification.VerificationOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.VerifyReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVerifyMethod(), responseObserver);
    }

    /**
     */
    public void verify(verification.VerificationOuterClass.VerifyRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.VerifyReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    /**
     */
    public void attach(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAttachMethod(), responseObserver);
    }

    /**
     */
    public void getAttach(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAttachMethod(), responseObserver);
    }

    /**
     */
    public void session(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionMethod(), responseObserver);
    }

    /**
     */
    public void invite(verification.VerificationOuterClass.InviteRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.InviteReply> responseObserver) {
      asyncUnimplementedUnaryCall(getInviteMethod(), responseObserver);
    }

    /**
     */
    public void get(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void status(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     */
    public void has(verification.VerificationOuterClass.HasRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.HasReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVerifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.CreateRequest,
                verification.VerificationOuterClass.VerifyReply>(
                  this, METHODID_CREATE_VERIFY)))
          .addMethod(
            getVerifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.VerifyRequest,
                verification.VerificationOuterClass.VerifyReply>(
                  this, METHODID_VERIFY)))
          .addMethod(
            getAttachMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.AttachRequest,
                verification.VerificationOuterClass.AttachReply>(
                  this, METHODID_ATTACH)))
          .addMethod(
            getGetAttachMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.AttachRequest,
                verification.VerificationOuterClass.AttachReply>(
                  this, METHODID_GET_ATTACH)))
          .addMethod(
            getSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.AttachRequest,
                verification.VerificationOuterClass.AttachReply>(
                  this, METHODID_SESSION)))
          .addMethod(
            getInviteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.InviteRequest,
                verification.VerificationOuterClass.InviteReply>(
                  this, METHODID_INVITE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.AttachRequest,
                verification.VerificationOuterClass.AttachReply>(
                  this, METHODID_GET)))
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.AttachRequest,
                verification.VerificationOuterClass.AttachReply>(
                  this, METHODID_STATUS)))
          .addMethod(
            getHasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                verification.VerificationOuterClass.HasRequest,
                verification.VerificationOuterClass.HasReply>(
                  this, METHODID_HAS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class VerificationStub extends io.grpc.stub.AbstractStub<VerificationStub> {
    private VerificationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VerificationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerificationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VerificationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void createVerify(verification.VerificationOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.VerifyReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verify(verification.VerificationOuterClass.VerifyRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.VerifyReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void attach(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAttach(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAttachMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void session(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void invite(verification.VerificationOuterClass.InviteRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.InviteReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void status(verification.VerificationOuterClass.AttachRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void has(verification.VerificationOuterClass.HasRequest request,
        io.grpc.stub.StreamObserver<verification.VerificationOuterClass.HasReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class VerificationBlockingStub extends io.grpc.stub.AbstractStub<VerificationBlockingStub> {
    private VerificationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VerificationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerificationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VerificationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public verification.VerificationOuterClass.VerifyReply createVerify(verification.VerificationOuterClass.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVerifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.VerifyReply verify(verification.VerificationOuterClass.VerifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.AttachReply attach(verification.VerificationOuterClass.AttachRequest request) {
      return blockingUnaryCall(
          getChannel(), getAttachMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.AttachReply getAttach(verification.VerificationOuterClass.AttachRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAttachMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.AttachReply session(verification.VerificationOuterClass.AttachRequest request) {
      return blockingUnaryCall(
          getChannel(), getSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.InviteReply invite(verification.VerificationOuterClass.InviteRequest request) {
      return blockingUnaryCall(
          getChannel(), getInviteMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.AttachReply get(verification.VerificationOuterClass.AttachRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.AttachReply status(verification.VerificationOuterClass.AttachRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public verification.VerificationOuterClass.HasReply has(verification.VerificationOuterClass.HasRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class VerificationFutureStub extends io.grpc.stub.AbstractStub<VerificationFutureStub> {
    private VerificationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VerificationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerificationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VerificationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.VerifyReply> createVerify(
        verification.VerificationOuterClass.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVerifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.VerifyReply> verify(
        verification.VerificationOuterClass.VerifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.AttachReply> attach(
        verification.VerificationOuterClass.AttachRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.AttachReply> getAttach(
        verification.VerificationOuterClass.AttachRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAttachMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.AttachReply> session(
        verification.VerificationOuterClass.AttachRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.InviteReply> invite(
        verification.VerificationOuterClass.InviteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInviteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.AttachReply> get(
        verification.VerificationOuterClass.AttachRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.AttachReply> status(
        verification.VerificationOuterClass.AttachRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verification.VerificationOuterClass.HasReply> has(
        verification.VerificationOuterClass.HasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VERIFY = 0;
  private static final int METHODID_VERIFY = 1;
  private static final int METHODID_ATTACH = 2;
  private static final int METHODID_GET_ATTACH = 3;
  private static final int METHODID_SESSION = 4;
  private static final int METHODID_INVITE = 5;
  private static final int METHODID_GET = 6;
  private static final int METHODID_STATUS = 7;
  private static final int METHODID_HAS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VerificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VerificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VERIFY:
          serviceImpl.createVerify((verification.VerificationOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.VerifyReply>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((verification.VerificationOuterClass.VerifyRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.VerifyReply>) responseObserver);
          break;
        case METHODID_ATTACH:
          serviceImpl.attach((verification.VerificationOuterClass.AttachRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply>) responseObserver);
          break;
        case METHODID_GET_ATTACH:
          serviceImpl.getAttach((verification.VerificationOuterClass.AttachRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply>) responseObserver);
          break;
        case METHODID_SESSION:
          serviceImpl.session((verification.VerificationOuterClass.AttachRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply>) responseObserver);
          break;
        case METHODID_INVITE:
          serviceImpl.invite((verification.VerificationOuterClass.InviteRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.InviteReply>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((verification.VerificationOuterClass.AttachRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((verification.VerificationOuterClass.AttachRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.AttachReply>) responseObserver);
          break;
        case METHODID_HAS:
          serviceImpl.has((verification.VerificationOuterClass.HasRequest) request,
              (io.grpc.stub.StreamObserver<verification.VerificationOuterClass.HasReply>) responseObserver);
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

  private static abstract class VerificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VerificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return verification.VerificationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Verification");
    }
  }

  private static final class VerificationFileDescriptorSupplier
      extends VerificationBaseDescriptorSupplier {
    VerificationFileDescriptorSupplier() {}
  }

  private static final class VerificationMethodDescriptorSupplier
      extends VerificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VerificationMethodDescriptorSupplier(String methodName) {
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
      synchronized (VerificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VerificationFileDescriptorSupplier())
              .addMethod(getCreateVerifyMethod())
              .addMethod(getVerifyMethod())
              .addMethod(getAttachMethod())
              .addMethod(getGetAttachMethod())
              .addMethod(getSessionMethod())
              .addMethod(getInviteMethod())
              .addMethod(getGetMethod())
              .addMethod(getStatusMethod())
              .addMethod(getHasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
