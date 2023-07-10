package GrpcClasses.User;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: User.proto")
public final class UserGrpcGrpc {

  private UserGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.User.UserGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.User.UserModelGrpc,
      GrpcClasses.User.User.Empty> getSaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUser",
      requestType = GrpcClasses.User.User.UserModelGrpc.class,
      responseType = GrpcClasses.User.User.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.User.UserModelGrpc,
      GrpcClasses.User.User.Empty> getSaveUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.User.UserModelGrpc, GrpcClasses.User.User.Empty> getSaveUserMethod;
    if ((getSaveUserMethod = UserGrpcGrpc.getSaveUserMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getSaveUserMethod = UserGrpcGrpc.getSaveUserMethod) == null) {
          UserGrpcGrpc.getSaveUserMethod = getSaveUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.User.UserModelGrpc, GrpcClasses.User.User.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.UserModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("saveUser"))
              .build();
        }
      }
    }
    return getSaveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.User.GetById,
      GrpcClasses.User.User.UserModelGrpc> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.User.User.GetById.class,
      responseType = GrpcClasses.User.User.UserModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.User.GetById,
      GrpcClasses.User.User.UserModelGrpc> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.User.GetById, GrpcClasses.User.User.UserModelGrpc> getFindByIdMethod;
    if ((getFindByIdMethod = UserGrpcGrpc.getFindByIdMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getFindByIdMethod = UserGrpcGrpc.getFindByIdMethod) == null) {
          UserGrpcGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.User.GetById, GrpcClasses.User.User.UserModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.UserModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.User.UserModelGrpc,
      GrpcClasses.User.User.Empty> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = GrpcClasses.User.User.UserModelGrpc.class,
      responseType = GrpcClasses.User.User.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.User.UserModelGrpc,
      GrpcClasses.User.User.Empty> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.User.UserModelGrpc, GrpcClasses.User.User.Empty> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserGrpcGrpc.getUpdateUserMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getUpdateUserMethod = UserGrpcGrpc.getUpdateUserMethod) == null) {
          UserGrpcGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.User.UserModelGrpc, GrpcClasses.User.User.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.UserModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.User.GetById,
      GrpcClasses.User.User.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = GrpcClasses.User.User.GetById.class,
      responseType = GrpcClasses.User.User.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.User.GetById,
      GrpcClasses.User.User.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.User.GetById, GrpcClasses.User.User.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserGrpcGrpc.getDeleteUserMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getDeleteUserMethod = UserGrpcGrpc.getDeleteUserMethod) == null) {
          UserGrpcGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.User.GetById, GrpcClasses.User.User.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.User.GetByEmail,
      GrpcClasses.User.User.UserModelGrpc> getFindByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByEmail",
      requestType = GrpcClasses.User.User.GetByEmail.class,
      responseType = GrpcClasses.User.User.UserModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.User.GetByEmail,
      GrpcClasses.User.User.UserModelGrpc> getFindByEmailMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.User.GetByEmail, GrpcClasses.User.User.UserModelGrpc> getFindByEmailMethod;
    if ((getFindByEmailMethod = UserGrpcGrpc.getFindByEmailMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getFindByEmailMethod = UserGrpcGrpc.getFindByEmailMethod) == null) {
          UserGrpcGrpc.getFindByEmailMethod = getFindByEmailMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.User.GetByEmail, GrpcClasses.User.User.UserModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.GetByEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.User.UserModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("findByEmail"))
              .build();
        }
      }
    }
    return getFindByEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserGrpcStub>() {
        @java.lang.Override
        public UserGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserGrpcStub(channel, callOptions);
        }
      };
    return UserGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserGrpcBlockingStub>() {
        @java.lang.Override
        public UserGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserGrpcBlockingStub(channel, callOptions);
        }
      };
    return UserGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserGrpcFutureStub>() {
        @java.lang.Override
        public UserGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserGrpcFutureStub(channel, callOptions);
        }
      };
    return UserGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveUser(GrpcClasses.User.User.UserModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveUserMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.User.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.UserModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(GrpcClasses.User.User.UserModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(GrpcClasses.User.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void findByEmail(GrpcClasses.User.User.GetByEmail request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.UserModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByEmailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.User.UserModelGrpc,
                GrpcClasses.User.User.Empty>(
                  this, METHODID_SAVE_USER)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.User.GetById,
                GrpcClasses.User.User.UserModelGrpc>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.User.UserModelGrpc,
                GrpcClasses.User.User.Empty>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.User.GetById,
                GrpcClasses.User.User.Empty>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getFindByEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.User.GetByEmail,
                GrpcClasses.User.User.UserModelGrpc>(
                  this, METHODID_FIND_BY_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class UserGrpcStub extends io.grpc.stub.AbstractAsyncStub<UserGrpcStub> {
    private UserGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveUser(GrpcClasses.User.User.UserModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.User.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.UserModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(GrpcClasses.User.User.UserModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(GrpcClasses.User.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByEmail(GrpcClasses.User.User.GetByEmail request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.User.UserModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserGrpcBlockingStub> {
    private UserGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.User.User.Empty saveUser(GrpcClasses.User.User.UserModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.User.UserModelGrpc findById(GrpcClasses.User.User.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.User.Empty updateUser(GrpcClasses.User.User.UserModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.User.Empty deleteUser(GrpcClasses.User.User.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.User.UserModelGrpc findByEmail(GrpcClasses.User.User.GetByEmail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<UserGrpcFutureStub> {
    private UserGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.User.Empty> saveUser(
        GrpcClasses.User.User.UserModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.User.UserModelGrpc> findById(
        GrpcClasses.User.User.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.User.Empty> updateUser(
        GrpcClasses.User.User.UserModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.User.Empty> deleteUser(
        GrpcClasses.User.User.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.User.UserModelGrpc> findByEmail(
        GrpcClasses.User.User.GetByEmail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_FIND_BY_EMAIL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((GrpcClasses.User.User.UserModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.User.User.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.User.UserModelGrpc>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((GrpcClasses.User.User.UserModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((GrpcClasses.User.User.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.User.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_EMAIL:
          serviceImpl.findByEmail((GrpcClasses.User.User.GetByEmail) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.User.UserModelGrpc>) responseObserver);
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

  private static abstract class UserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.User.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserGrpc");
    }
  }

  private static final class UserGrpcFileDescriptorSupplier
      extends UserGrpcBaseDescriptorSupplier {
    UserGrpcFileDescriptorSupplier() {}
  }

  private static final class UserGrpcMethodDescriptorSupplier
      extends UserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserGrpcFileDescriptorSupplier())
              .addMethod(getSaveUserMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getFindByEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
