package position;

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
    comments = "Source: position.proto")
public final class PositionGrpc {

  private PositionGrpc() {}

  public static final String SERVICE_NAME = "position.Position";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.PositionRequest,
      position.PositionOuterClass.PositionReply> getPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Position",
      requestType = position.PositionOuterClass.PositionRequest.class,
      responseType = position.PositionOuterClass.PositionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.PositionRequest,
      position.PositionOuterClass.PositionReply> getPositionMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.PositionRequest, position.PositionOuterClass.PositionReply> getPositionMethod;
    if ((getPositionMethod = PositionGrpc.getPositionMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getPositionMethod = PositionGrpc.getPositionMethod) == null) {
          PositionGrpc.getPositionMethod = getPositionMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.PositionRequest, position.PositionOuterClass.PositionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "Position"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.PositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.PositionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("Position"))
                  .build();
          }
        }
     }
     return getPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.ListPositionRequest,
      position.PositionOuterClass.ListPositionReply> getListPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPosition",
      requestType = position.PositionOuterClass.ListPositionRequest.class,
      responseType = position.PositionOuterClass.ListPositionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.ListPositionRequest,
      position.PositionOuterClass.ListPositionReply> getListPositionMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.ListPositionRequest, position.PositionOuterClass.ListPositionReply> getListPositionMethod;
    if ((getListPositionMethod = PositionGrpc.getListPositionMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getListPositionMethod = PositionGrpc.getListPositionMethod) == null) {
          PositionGrpc.getListPositionMethod = getListPositionMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.ListPositionRequest, position.PositionOuterClass.ListPositionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "ListPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.ListPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.ListPositionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("ListPosition"))
                  .build();
          }
        }
     }
     return getListPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.ListAddressRequest,
      position.PositionOuterClass.ListAddressReply> getListAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAddress",
      requestType = position.PositionOuterClass.ListAddressRequest.class,
      responseType = position.PositionOuterClass.ListAddressReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.ListAddressRequest,
      position.PositionOuterClass.ListAddressReply> getListAddressMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.ListAddressRequest, position.PositionOuterClass.ListAddressReply> getListAddressMethod;
    if ((getListAddressMethod = PositionGrpc.getListAddressMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getListAddressMethod = PositionGrpc.getListAddressMethod) == null) {
          PositionGrpc.getListAddressMethod = getListAddressMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.ListAddressRequest, position.PositionOuterClass.ListAddressReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "ListAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.ListAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.ListAddressReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("ListAddress"))
                  .build();
          }
        }
     }
     return getListAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.CreateAddressRequest,
      position.PositionOuterClass.Address> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = position.PositionOuterClass.CreateAddressRequest.class,
      responseType = position.PositionOuterClass.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.CreateAddressRequest,
      position.PositionOuterClass.Address> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.CreateAddressRequest, position.PositionOuterClass.Address> getCreateAddressMethod;
    if ((getCreateAddressMethod = PositionGrpc.getCreateAddressMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getCreateAddressMethod = PositionGrpc.getCreateAddressMethod) == null) {
          PositionGrpc.getCreateAddressMethod = getCreateAddressMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.CreateAddressRequest, position.PositionOuterClass.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.CreateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.Address.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("CreateAddress"))
                  .build();
          }
        }
     }
     return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.DeleteAddressRequest,
      com.google.protobuf.Empty> getDeleteAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAddress",
      requestType = position.PositionOuterClass.DeleteAddressRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.DeleteAddressRequest,
      com.google.protobuf.Empty> getDeleteAddressMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.DeleteAddressRequest, com.google.protobuf.Empty> getDeleteAddressMethod;
    if ((getDeleteAddressMethod = PositionGrpc.getDeleteAddressMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getDeleteAddressMethod = PositionGrpc.getDeleteAddressMethod) == null) {
          PositionGrpc.getDeleteAddressMethod = getDeleteAddressMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.DeleteAddressRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "DeleteAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.DeleteAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("DeleteAddress"))
                  .build();
          }
        }
     }
     return getDeleteAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.GetAddressRequest,
      position.PositionOuterClass.Address> getGetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddress",
      requestType = position.PositionOuterClass.GetAddressRequest.class,
      responseType = position.PositionOuterClass.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.GetAddressRequest,
      position.PositionOuterClass.Address> getGetAddressMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.GetAddressRequest, position.PositionOuterClass.Address> getGetAddressMethod;
    if ((getGetAddressMethod = PositionGrpc.getGetAddressMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getGetAddressMethod = PositionGrpc.getGetAddressMethod) == null) {
          PositionGrpc.getGetAddressMethod = getGetAddressMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.GetAddressRequest, position.PositionOuterClass.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "GetAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.GetAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.Address.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("GetAddress"))
                  .build();
          }
        }
     }
     return getGetAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<position.PositionOuterClass.UpdateAddressRequest,
      position.PositionOuterClass.Address> getUpdateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAddress",
      requestType = position.PositionOuterClass.UpdateAddressRequest.class,
      responseType = position.PositionOuterClass.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<position.PositionOuterClass.UpdateAddressRequest,
      position.PositionOuterClass.Address> getUpdateAddressMethod() {
    io.grpc.MethodDescriptor<position.PositionOuterClass.UpdateAddressRequest, position.PositionOuterClass.Address> getUpdateAddressMethod;
    if ((getUpdateAddressMethod = PositionGrpc.getUpdateAddressMethod) == null) {
      synchronized (PositionGrpc.class) {
        if ((getUpdateAddressMethod = PositionGrpc.getUpdateAddressMethod) == null) {
          PositionGrpc.getUpdateAddressMethod = getUpdateAddressMethod = 
              io.grpc.MethodDescriptor.<position.PositionOuterClass.UpdateAddressRequest, position.PositionOuterClass.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "position.Position", "UpdateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.UpdateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  position.PositionOuterClass.Address.getDefaultInstance()))
                  .setSchemaDescriptor(new PositionMethodDescriptorSupplier("UpdateAddress"))
                  .build();
          }
        }
     }
     return getUpdateAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PositionStub newStub(io.grpc.Channel channel) {
    return new PositionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PositionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PositionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PositionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PositionFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class PositionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void position(position.PositionOuterClass.PositionRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.PositionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPositionMethod(), responseObserver);
    }

    /**
     */
    public void listPosition(position.PositionOuterClass.ListPositionRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.ListPositionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getListPositionMethod(), responseObserver);
    }

    /**
     */
    public void listAddress(position.PositionOuterClass.ListAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.ListAddressReply> responseObserver) {
      asyncUnimplementedUnaryCall(getListAddressMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(position.PositionOuterClass.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.Address> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void deleteAddress(position.PositionOuterClass.DeleteAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAddress(position.PositionOuterClass.GetAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.Address> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAddressMethod(), responseObserver);
    }

    /**
     */
    public void updateAddress(position.PositionOuterClass.UpdateAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.Address> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.PositionRequest,
                position.PositionOuterClass.PositionReply>(
                  this, METHODID_POSITION)))
          .addMethod(
            getListPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.ListPositionRequest,
                position.PositionOuterClass.ListPositionReply>(
                  this, METHODID_LIST_POSITION)))
          .addMethod(
            getListAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.ListAddressRequest,
                position.PositionOuterClass.ListAddressReply>(
                  this, METHODID_LIST_ADDRESS)))
          .addMethod(
            getCreateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.CreateAddressRequest,
                position.PositionOuterClass.Address>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getDeleteAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.DeleteAddressRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ADDRESS)))
          .addMethod(
            getGetAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.GetAddressRequest,
                position.PositionOuterClass.Address>(
                  this, METHODID_GET_ADDRESS)))
          .addMethod(
            getUpdateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                position.PositionOuterClass.UpdateAddressRequest,
                position.PositionOuterClass.Address>(
                  this, METHODID_UPDATE_ADDRESS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PositionStub extends io.grpc.stub.AbstractStub<PositionStub> {
    private PositionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PositionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PositionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PositionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void position(position.PositionOuterClass.PositionRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.PositionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPosition(position.PositionOuterClass.ListPositionRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.ListPositionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAddress(position.PositionOuterClass.ListAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.ListAddressReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(position.PositionOuterClass.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.Address> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAddress(position.PositionOuterClass.DeleteAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddress(position.PositionOuterClass.GetAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.Address> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(position.PositionOuterClass.UpdateAddressRequest request,
        io.grpc.stub.StreamObserver<position.PositionOuterClass.Address> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PositionBlockingStub extends io.grpc.stub.AbstractStub<PositionBlockingStub> {
    private PositionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PositionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PositionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PositionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public position.PositionOuterClass.PositionReply position(position.PositionOuterClass.PositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public position.PositionOuterClass.ListPositionReply listPosition(position.PositionOuterClass.ListPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public position.PositionOuterClass.ListAddressReply listAddress(position.PositionOuterClass.ListAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public position.PositionOuterClass.Address createAddress(position.PositionOuterClass.CreateAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAddress(position.PositionOuterClass.DeleteAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public position.PositionOuterClass.Address getAddress(position.PositionOuterClass.GetAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public position.PositionOuterClass.Address updateAddress(position.PositionOuterClass.UpdateAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PositionFutureStub extends io.grpc.stub.AbstractStub<PositionFutureStub> {
    private PositionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PositionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PositionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PositionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<position.PositionOuterClass.PositionReply> position(
        position.PositionOuterClass.PositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<position.PositionOuterClass.ListPositionReply> listPosition(
        position.PositionOuterClass.ListPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<position.PositionOuterClass.ListAddressReply> listAddress(
        position.PositionOuterClass.ListAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<position.PositionOuterClass.Address> createAddress(
        position.PositionOuterClass.CreateAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAddress(
        position.PositionOuterClass.DeleteAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<position.PositionOuterClass.Address> getAddress(
        position.PositionOuterClass.GetAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<position.PositionOuterClass.Address> updateAddress(
        position.PositionOuterClass.UpdateAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POSITION = 0;
  private static final int METHODID_LIST_POSITION = 1;
  private static final int METHODID_LIST_ADDRESS = 2;
  private static final int METHODID_CREATE_ADDRESS = 3;
  private static final int METHODID_DELETE_ADDRESS = 4;
  private static final int METHODID_GET_ADDRESS = 5;
  private static final int METHODID_UPDATE_ADDRESS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PositionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PositionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POSITION:
          serviceImpl.position((position.PositionOuterClass.PositionRequest) request,
              (io.grpc.stub.StreamObserver<position.PositionOuterClass.PositionReply>) responseObserver);
          break;
        case METHODID_LIST_POSITION:
          serviceImpl.listPosition((position.PositionOuterClass.ListPositionRequest) request,
              (io.grpc.stub.StreamObserver<position.PositionOuterClass.ListPositionReply>) responseObserver);
          break;
        case METHODID_LIST_ADDRESS:
          serviceImpl.listAddress((position.PositionOuterClass.ListAddressRequest) request,
              (io.grpc.stub.StreamObserver<position.PositionOuterClass.ListAddressReply>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((position.PositionOuterClass.CreateAddressRequest) request,
              (io.grpc.stub.StreamObserver<position.PositionOuterClass.Address>) responseObserver);
          break;
        case METHODID_DELETE_ADDRESS:
          serviceImpl.deleteAddress((position.PositionOuterClass.DeleteAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ADDRESS:
          serviceImpl.getAddress((position.PositionOuterClass.GetAddressRequest) request,
              (io.grpc.stub.StreamObserver<position.PositionOuterClass.Address>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((position.PositionOuterClass.UpdateAddressRequest) request,
              (io.grpc.stub.StreamObserver<position.PositionOuterClass.Address>) responseObserver);
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

  private static abstract class PositionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PositionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return position.PositionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Position");
    }
  }

  private static final class PositionFileDescriptorSupplier
      extends PositionBaseDescriptorSupplier {
    PositionFileDescriptorSupplier() {}
  }

  private static final class PositionMethodDescriptorSupplier
      extends PositionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PositionMethodDescriptorSupplier(String methodName) {
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
      synchronized (PositionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PositionFileDescriptorSupplier())
              .addMethod(getPositionMethod())
              .addMethod(getListPositionMethod())
              .addMethod(getListAddressMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getDeleteAddressMethod())
              .addMethod(getGetAddressMethod())
              .addMethod(getUpdateAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
