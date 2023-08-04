package GrpcClasses.SavePost;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SavePost.proto")
public final class SavePostGrpcGrpc {

  private SavePostGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.SavePost.SavePostGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.SaveModelGrpc,
      GrpcClasses.SavePost.SavePost.Empty> getSaveSavePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveSavePost",
      requestType = GrpcClasses.SavePost.SavePost.SaveModelGrpc.class,
      responseType = GrpcClasses.SavePost.SavePost.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.SaveModelGrpc,
      GrpcClasses.SavePost.SavePost.Empty> getSaveSavePostMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.SaveModelGrpc, GrpcClasses.SavePost.SavePost.Empty> getSaveSavePostMethod;
    if ((getSaveSavePostMethod = SavePostGrpcGrpc.getSaveSavePostMethod) == null) {
      synchronized (SavePostGrpcGrpc.class) {
        if ((getSaveSavePostMethod = SavePostGrpcGrpc.getSaveSavePostMethod) == null) {
          SavePostGrpcGrpc.getSaveSavePostMethod = getSaveSavePostMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.SavePost.SavePost.SaveModelGrpc, GrpcClasses.SavePost.SavePost.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveSavePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.SavePost.SavePost.SaveModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.SavePost.SavePost.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SavePostGrpcMethodDescriptorSupplier("saveSavePost"))
              .build();
        }
      }
    }
    return getSaveSavePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.GetById,
      GrpcClasses.SavePost.SavePost.Empty> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = GrpcClasses.SavePost.SavePost.GetById.class,
      responseType = GrpcClasses.SavePost.SavePost.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.GetById,
      GrpcClasses.SavePost.SavePost.Empty> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.GetById, GrpcClasses.SavePost.SavePost.Empty> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = SavePostGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (SavePostGrpcGrpc.class) {
        if ((getDeleteByIdMethod = SavePostGrpcGrpc.getDeleteByIdMethod) == null) {
          SavePostGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.SavePost.SavePost.GetById, GrpcClasses.SavePost.SavePost.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.SavePost.SavePost.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.SavePost.SavePost.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SavePostGrpcMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.SaveModelGrpc,
      GrpcClasses.SavePost.SavePost.SaveModelGrpc> getFindByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByUserId",
      requestType = GrpcClasses.SavePost.SavePost.SaveModelGrpc.class,
      responseType = GrpcClasses.SavePost.SavePost.SaveModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.SaveModelGrpc,
      GrpcClasses.SavePost.SavePost.SaveModelGrpc> getFindByUserIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.SavePost.SavePost.SaveModelGrpc, GrpcClasses.SavePost.SavePost.SaveModelGrpc> getFindByUserIdMethod;
    if ((getFindByUserIdMethod = SavePostGrpcGrpc.getFindByUserIdMethod) == null) {
      synchronized (SavePostGrpcGrpc.class) {
        if ((getFindByUserIdMethod = SavePostGrpcGrpc.getFindByUserIdMethod) == null) {
          SavePostGrpcGrpc.getFindByUserIdMethod = getFindByUserIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.SavePost.SavePost.SaveModelGrpc, GrpcClasses.SavePost.SavePost.SaveModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.SavePost.SavePost.SaveModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.SavePost.SavePost.SaveModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new SavePostGrpcMethodDescriptorSupplier("findByUserId"))
              .build();
        }
      }
    }
    return getFindByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SavePostGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SavePostGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SavePostGrpcStub>() {
        @java.lang.Override
        public SavePostGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SavePostGrpcStub(channel, callOptions);
        }
      };
    return SavePostGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SavePostGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SavePostGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SavePostGrpcBlockingStub>() {
        @java.lang.Override
        public SavePostGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SavePostGrpcBlockingStub(channel, callOptions);
        }
      };
    return SavePostGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SavePostGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SavePostGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SavePostGrpcFutureStub>() {
        @java.lang.Override
        public SavePostGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SavePostGrpcFutureStub(channel, callOptions);
        }
      };
    return SavePostGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SavePostGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveSavePost(GrpcClasses.SavePost.SavePost.SaveModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveSavePostMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(GrpcClasses.SavePost.SavePost.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.SavePost.SavePost.SaveModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.SaveModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveSavePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.SavePost.SavePost.SaveModelGrpc,
                GrpcClasses.SavePost.SavePost.Empty>(
                  this, METHODID_SAVE_SAVE_POST)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.SavePost.SavePost.GetById,
                GrpcClasses.SavePost.SavePost.Empty>(
                  this, METHODID_DELETE_BY_ID)))
          .addMethod(
            getFindByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.SavePost.SavePost.SaveModelGrpc,
                GrpcClasses.SavePost.SavePost.SaveModelGrpc>(
                  this, METHODID_FIND_BY_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SavePostGrpcStub extends io.grpc.stub.AbstractAsyncStub<SavePostGrpcStub> {
    private SavePostGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SavePostGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SavePostGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveSavePost(GrpcClasses.SavePost.SavePost.SaveModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveSavePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(GrpcClasses.SavePost.SavePost.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.SavePost.SavePost.SaveModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.SaveModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SavePostGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<SavePostGrpcBlockingStub> {
    private SavePostGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SavePostGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SavePostGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.SavePost.SavePost.Empty saveSavePost(GrpcClasses.SavePost.SavePost.SaveModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveSavePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.SavePost.SavePost.Empty deleteById(GrpcClasses.SavePost.SavePost.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.SavePost.SavePost.SaveModelGrpc> findByUserId(
        GrpcClasses.SavePost.SavePost.SaveModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SavePostGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<SavePostGrpcFutureStub> {
    private SavePostGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SavePostGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SavePostGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.SavePost.SavePost.Empty> saveSavePost(
        GrpcClasses.SavePost.SavePost.SaveModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveSavePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.SavePost.SavePost.Empty> deleteById(
        GrpcClasses.SavePost.SavePost.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_SAVE_POST = 0;
  private static final int METHODID_DELETE_BY_ID = 1;
  private static final int METHODID_FIND_BY_USER_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SavePostGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SavePostGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_SAVE_POST:
          serviceImpl.saveSavePost((GrpcClasses.SavePost.SavePost.SaveModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.Empty>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((GrpcClasses.SavePost.SavePost.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID:
          serviceImpl.findByUserId((GrpcClasses.SavePost.SavePost.SaveModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.SavePost.SavePost.SaveModelGrpc>) responseObserver);
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

  private static abstract class SavePostGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SavePostGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.SavePost.SavePost.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SavePostGrpc");
    }
  }

  private static final class SavePostGrpcFileDescriptorSupplier
      extends SavePostGrpcBaseDescriptorSupplier {
    SavePostGrpcFileDescriptorSupplier() {}
  }

  private static final class SavePostGrpcMethodDescriptorSupplier
      extends SavePostGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SavePostGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (SavePostGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SavePostGrpcFileDescriptorSupplier())
              .addMethod(getSaveSavePostMethod())
              .addMethod(getDeleteByIdMethod())
              .addMethod(getFindByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
