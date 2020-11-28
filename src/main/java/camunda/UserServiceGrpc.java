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
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "camunda.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<camunda.UserOuterClass.CreateUserRequest,
      camunda.UserOuterClass.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = camunda.UserOuterClass.CreateUserRequest.class,
      responseType = camunda.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.UserOuterClass.CreateUserRequest,
      camunda.UserOuterClass.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<camunda.UserOuterClass.CreateUserRequest, camunda.UserOuterClass.User> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<camunda.UserOuterClass.CreateUserRequest, camunda.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.UserService", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.UserOuterClass.ListUserRequest,
      camunda.UserOuterClass.ListUserReply> getListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUser",
      requestType = camunda.UserOuterClass.ListUserRequest.class,
      responseType = camunda.UserOuterClass.ListUserReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.UserOuterClass.ListUserRequest,
      camunda.UserOuterClass.ListUserReply> getListUserMethod() {
    io.grpc.MethodDescriptor<camunda.UserOuterClass.ListUserRequest, camunda.UserOuterClass.ListUserReply> getListUserMethod;
    if ((getListUserMethod = UserServiceGrpc.getListUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserMethod = UserServiceGrpc.getListUserMethod) == null) {
          UserServiceGrpc.getListUserMethod = getListUserMethod = 
              io.grpc.MethodDescriptor.<camunda.UserOuterClass.ListUserRequest, camunda.UserOuterClass.ListUserReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.UserService", "ListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.ListUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.ListUserReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUser"))
                  .build();
          }
        }
     }
     return getListUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.UserOuterClass.GetUserRequest,
      camunda.UserOuterClass.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = camunda.UserOuterClass.GetUserRequest.class,
      responseType = camunda.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.UserOuterClass.GetUserRequest,
      camunda.UserOuterClass.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<camunda.UserOuterClass.GetUserRequest, camunda.UserOuterClass.User> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<camunda.UserOuterClass.GetUserRequest, camunda.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.UserService", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.UserOuterClass.CreateGroupRequest,
      camunda.UserOuterClass.Group> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = camunda.UserOuterClass.CreateGroupRequest.class,
      responseType = camunda.UserOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.UserOuterClass.CreateGroupRequest,
      camunda.UserOuterClass.Group> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<camunda.UserOuterClass.CreateGroupRequest, camunda.UserOuterClass.Group> getCreateGroupMethod;
    if ((getCreateGroupMethod = UserServiceGrpc.getCreateGroupMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateGroupMethod = UserServiceGrpc.getCreateGroupMethod) == null) {
          UserServiceGrpc.getCreateGroupMethod = getCreateGroupMethod = 
              io.grpc.MethodDescriptor.<camunda.UserOuterClass.CreateGroupRequest, camunda.UserOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.UserService", "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.CreateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.Group.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateGroup"))
                  .build();
          }
        }
     }
     return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.UserOuterClass.ListGroupRequest,
      camunda.UserOuterClass.ListGroupReply> getListGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroup",
      requestType = camunda.UserOuterClass.ListGroupRequest.class,
      responseType = camunda.UserOuterClass.ListGroupReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.UserOuterClass.ListGroupRequest,
      camunda.UserOuterClass.ListGroupReply> getListGroupMethod() {
    io.grpc.MethodDescriptor<camunda.UserOuterClass.ListGroupRequest, camunda.UserOuterClass.ListGroupReply> getListGroupMethod;
    if ((getListGroupMethod = UserServiceGrpc.getListGroupMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListGroupMethod = UserServiceGrpc.getListGroupMethod) == null) {
          UserServiceGrpc.getListGroupMethod = getListGroupMethod = 
              io.grpc.MethodDescriptor.<camunda.UserOuterClass.ListGroupRequest, camunda.UserOuterClass.ListGroupReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.UserService", "ListGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.ListGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.ListGroupReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListGroup"))
                  .build();
          }
        }
     }
     return getListGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<camunda.UserOuterClass.GetGroupRequest,
      camunda.UserOuterClass.Group> getGetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroup",
      requestType = camunda.UserOuterClass.GetGroupRequest.class,
      responseType = camunda.UserOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<camunda.UserOuterClass.GetGroupRequest,
      camunda.UserOuterClass.Group> getGetGroupMethod() {
    io.grpc.MethodDescriptor<camunda.UserOuterClass.GetGroupRequest, camunda.UserOuterClass.Group> getGetGroupMethod;
    if ((getGetGroupMethod = UserServiceGrpc.getGetGroupMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetGroupMethod = UserServiceGrpc.getGetGroupMethod) == null) {
          UserServiceGrpc.getGetGroupMethod = getGetGroupMethod = 
              io.grpc.MethodDescriptor.<camunda.UserOuterClass.GetGroupRequest, camunda.UserOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "camunda.UserService", "GetGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.GetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  camunda.UserOuterClass.Group.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetGroup"))
                  .build();
          }
        }
     }
     return getGetGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(camunda.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void listUser(camunda.UserOuterClass.ListUserRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.ListUserReply> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(camunda.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void createGroup(camunda.UserOuterClass.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     */
    public void listGroup(camunda.UserOuterClass.ListGroupRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.ListGroupReply> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupMethod(), responseObserver);
    }

    /**
     */
    public void getGroup(camunda.UserOuterClass.GetGroupRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.UserOuterClass.CreateUserRequest,
                camunda.UserOuterClass.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getListUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.UserOuterClass.ListUserRequest,
                camunda.UserOuterClass.ListUserReply>(
                  this, METHODID_LIST_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.UserOuterClass.GetUserRequest,
                camunda.UserOuterClass.User>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getCreateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.UserOuterClass.CreateGroupRequest,
                camunda.UserOuterClass.Group>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getListGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.UserOuterClass.ListGroupRequest,
                camunda.UserOuterClass.ListGroupReply>(
                  this, METHODID_LIST_GROUP)))
          .addMethod(
            getGetGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                camunda.UserOuterClass.GetGroupRequest,
                camunda.UserOuterClass.Group>(
                  this, METHODID_GET_GROUP)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(camunda.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUser(camunda.UserOuterClass.ListUserRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.ListUserReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(camunda.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGroup(camunda.UserOuterClass.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listGroup(camunda.UserOuterClass.ListGroupRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.ListGroupReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroup(camunda.UserOuterClass.GetGroupRequest request,
        io.grpc.stub.StreamObserver<camunda.UserOuterClass.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public camunda.UserOuterClass.User createUser(camunda.UserOuterClass.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.UserOuterClass.ListUserReply listUser(camunda.UserOuterClass.ListUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.UserOuterClass.User getUser(camunda.UserOuterClass.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.UserOuterClass.Group createGroup(camunda.UserOuterClass.CreateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.UserOuterClass.ListGroupReply listGroup(camunda.UserOuterClass.ListGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public camunda.UserOuterClass.Group getGroup(camunda.UserOuterClass.GetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.UserOuterClass.User> createUser(
        camunda.UserOuterClass.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.UserOuterClass.ListUserReply> listUser(
        camunda.UserOuterClass.ListUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.UserOuterClass.User> getUser(
        camunda.UserOuterClass.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.UserOuterClass.Group> createGroup(
        camunda.UserOuterClass.CreateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.UserOuterClass.ListGroupReply> listGroup(
        camunda.UserOuterClass.ListGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<camunda.UserOuterClass.Group> getGroup(
        camunda.UserOuterClass.GetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_LIST_USER = 1;
  private static final int METHODID_GET_USER = 2;
  private static final int METHODID_CREATE_GROUP = 3;
  private static final int METHODID_LIST_GROUP = 4;
  private static final int METHODID_GET_GROUP = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((camunda.UserOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<camunda.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_LIST_USER:
          serviceImpl.listUser((camunda.UserOuterClass.ListUserRequest) request,
              (io.grpc.stub.StreamObserver<camunda.UserOuterClass.ListUserReply>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((camunda.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<camunda.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((camunda.UserOuterClass.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<camunda.UserOuterClass.Group>) responseObserver);
          break;
        case METHODID_LIST_GROUP:
          serviceImpl.listGroup((camunda.UserOuterClass.ListGroupRequest) request,
              (io.grpc.stub.StreamObserver<camunda.UserOuterClass.ListGroupReply>) responseObserver);
          break;
        case METHODID_GET_GROUP:
          serviceImpl.getGroup((camunda.UserOuterClass.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<camunda.UserOuterClass.Group>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return camunda.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getListUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getCreateGroupMethod())
              .addMethod(getListGroupMethod())
              .addMethod(getGetGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
