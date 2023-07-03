package GrpcClasses.Match;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Match.proto")
public final class MatchesGrpc {

  private MatchesGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Match.Matches";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchIdRequest,
      GrpcClasses.Match.Match.MatchModel> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Match.Match.MatchIdRequest.class,
      responseType = GrpcClasses.Match.Match.MatchModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchIdRequest,
      GrpcClasses.Match.Match.MatchModel> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchIdRequest, GrpcClasses.Match.Match.MatchModel> getFindByIdMethod;
    if ((getFindByIdMethod = MatchesGrpc.getFindByIdMethod) == null) {
      synchronized (MatchesGrpc.class) {
        if ((getFindByIdMethod = MatchesGrpc.getFindByIdMethod) == null) {
          MatchesGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Match.Match.MatchIdRequest, GrpcClasses.Match.Match.MatchModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.MatchIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.MatchModel.getDefaultInstance()))
              .setSchemaDescriptor(new MatchesMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchModel,
      GrpcClasses.Match.Match.Empty> getUpdateMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateMatch",
      requestType = GrpcClasses.Match.Match.MatchModel.class,
      responseType = GrpcClasses.Match.Match.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchModel,
      GrpcClasses.Match.Match.Empty> getUpdateMatchMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchModel, GrpcClasses.Match.Match.Empty> getUpdateMatchMethod;
    if ((getUpdateMatchMethod = MatchesGrpc.getUpdateMatchMethod) == null) {
      synchronized (MatchesGrpc.class) {
        if ((getUpdateMatchMethod = MatchesGrpc.getUpdateMatchMethod) == null) {
          MatchesGrpc.getUpdateMatchMethod = getUpdateMatchMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Match.Match.MatchModel, GrpcClasses.Match.Match.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.MatchModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MatchesMethodDescriptorSupplier("updateMatch"))
              .build();
        }
      }
    }
    return getUpdateMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchIdRequest,
      GrpcClasses.Match.Match.Empty> getDeleteMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMatch",
      requestType = GrpcClasses.Match.Match.MatchIdRequest.class,
      responseType = GrpcClasses.Match.Match.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchIdRequest,
      GrpcClasses.Match.Match.Empty> getDeleteMatchMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchIdRequest, GrpcClasses.Match.Match.Empty> getDeleteMatchMethod;
    if ((getDeleteMatchMethod = MatchesGrpc.getDeleteMatchMethod) == null) {
      synchronized (MatchesGrpc.class) {
        if ((getDeleteMatchMethod = MatchesGrpc.getDeleteMatchMethod) == null) {
          MatchesGrpc.getDeleteMatchMethod = getDeleteMatchMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Match.Match.MatchIdRequest, GrpcClasses.Match.Match.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.MatchIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MatchesMethodDescriptorSupplier("deleteMatch"))
              .build();
        }
      }
    }
    return getDeleteMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Match.Match.UserIdRequest,
      GrpcClasses.Match.Match.MatchModel> getFindByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByUserId",
      requestType = GrpcClasses.Match.Match.UserIdRequest.class,
      responseType = GrpcClasses.Match.Match.MatchModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Match.Match.UserIdRequest,
      GrpcClasses.Match.Match.MatchModel> getFindByUserIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Match.Match.UserIdRequest, GrpcClasses.Match.Match.MatchModel> getFindByUserIdMethod;
    if ((getFindByUserIdMethod = MatchesGrpc.getFindByUserIdMethod) == null) {
      synchronized (MatchesGrpc.class) {
        if ((getFindByUserIdMethod = MatchesGrpc.getFindByUserIdMethod) == null) {
          MatchesGrpc.getFindByUserIdMethod = getFindByUserIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Match.Match.UserIdRequest, GrpcClasses.Match.Match.MatchModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.MatchModel.getDefaultInstance()))
              .setSchemaDescriptor(new MatchesMethodDescriptorSupplier("findByUserId"))
              .build();
        }
      }
    }
    return getFindByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchModel,
      GrpcClasses.Match.Match.Empty> getCreateMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createMatch",
      requestType = GrpcClasses.Match.Match.MatchModel.class,
      responseType = GrpcClasses.Match.Match.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchModel,
      GrpcClasses.Match.Match.Empty> getCreateMatchMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Match.Match.MatchModel, GrpcClasses.Match.Match.Empty> getCreateMatchMethod;
    if ((getCreateMatchMethod = MatchesGrpc.getCreateMatchMethod) == null) {
      synchronized (MatchesGrpc.class) {
        if ((getCreateMatchMethod = MatchesGrpc.getCreateMatchMethod) == null) {
          MatchesGrpc.getCreateMatchMethod = getCreateMatchMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Match.Match.MatchModel, GrpcClasses.Match.Match.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.MatchModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Match.Match.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MatchesMethodDescriptorSupplier("createMatch"))
              .build();
        }
      }
    }
    return getCreateMatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MatchesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchesStub>() {
        @java.lang.Override
        public MatchesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchesStub(channel, callOptions);
        }
      };
    return MatchesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MatchesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchesBlockingStub>() {
        @java.lang.Override
        public MatchesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchesBlockingStub(channel, callOptions);
        }
      };
    return MatchesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MatchesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchesFutureStub>() {
        @java.lang.Override
        public MatchesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchesFutureStub(channel, callOptions);
        }
      };
    return MatchesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MatchesImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(GrpcClasses.Match.Match.MatchIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.MatchModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateMatch(GrpcClasses.Match.Match.MatchModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMatchMethod(), responseObserver);
    }

    /**
     */
    public void deleteMatch(GrpcClasses.Match.Match.MatchIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMatchMethod(), responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.Match.Match.UserIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.MatchModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void createMatch(GrpcClasses.Match.Match.MatchModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Match.Match.MatchIdRequest,
                GrpcClasses.Match.Match.MatchModel>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getUpdateMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Match.Match.MatchModel,
                GrpcClasses.Match.Match.Empty>(
                  this, METHODID_UPDATE_MATCH)))
          .addMethod(
            getDeleteMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Match.Match.MatchIdRequest,
                GrpcClasses.Match.Match.Empty>(
                  this, METHODID_DELETE_MATCH)))
          .addMethod(
            getFindByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Match.Match.UserIdRequest,
                GrpcClasses.Match.Match.MatchModel>(
                  this, METHODID_FIND_BY_USER_ID)))
          .addMethod(
            getCreateMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Match.Match.MatchModel,
                GrpcClasses.Match.Match.Empty>(
                  this, METHODID_CREATE_MATCH)))
          .build();
    }
  }

  /**
   */
  public static final class MatchesStub extends io.grpc.stub.AbstractAsyncStub<MatchesStub> {
    private MatchesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MatchesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchesStub(channel, callOptions);
    }

    /**
     */
    public void findById(GrpcClasses.Match.Match.MatchIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.MatchModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMatch(GrpcClasses.Match.Match.MatchModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMatch(GrpcClasses.Match.Match.MatchIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserId(GrpcClasses.Match.Match.UserIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.MatchModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMatch(GrpcClasses.Match.Match.MatchModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MatchesBlockingStub extends io.grpc.stub.AbstractBlockingStub<MatchesBlockingStub> {
    private MatchesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MatchesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchesBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Match.Match.MatchModel findById(GrpcClasses.Match.Match.MatchIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Match.Match.Empty updateMatch(GrpcClasses.Match.Match.MatchModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Match.Match.Empty deleteMatch(GrpcClasses.Match.Match.MatchIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Match.Match.MatchModel> findByUserId(
        GrpcClasses.Match.Match.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Match.Match.Empty createMatch(GrpcClasses.Match.Match.MatchModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMatchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MatchesFutureStub extends io.grpc.stub.AbstractFutureStub<MatchesFutureStub> {
    private MatchesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MatchesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Match.Match.MatchModel> findById(
        GrpcClasses.Match.Match.MatchIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Match.Match.Empty> updateMatch(
        GrpcClasses.Match.Match.MatchModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Match.Match.Empty> deleteMatch(
        GrpcClasses.Match.Match.MatchIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Match.Match.Empty> createMatch(
        GrpcClasses.Match.Match.MatchModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_UPDATE_MATCH = 1;
  private static final int METHODID_DELETE_MATCH = 2;
  private static final int METHODID_FIND_BY_USER_ID = 3;
  private static final int METHODID_CREATE_MATCH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MatchesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MatchesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Match.Match.MatchIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.MatchModel>) responseObserver);
          break;
        case METHODID_UPDATE_MATCH:
          serviceImpl.updateMatch((GrpcClasses.Match.Match.MatchModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MATCH:
          serviceImpl.deleteMatch((GrpcClasses.Match.Match.MatchIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID:
          serviceImpl.findByUserId((GrpcClasses.Match.Match.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.MatchModel>) responseObserver);
          break;
        case METHODID_CREATE_MATCH:
          serviceImpl.createMatch((GrpcClasses.Match.Match.MatchModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Match.Match.Empty>) responseObserver);
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

  private static abstract class MatchesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MatchesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Match.Match.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Matches");
    }
  }

  private static final class MatchesFileDescriptorSupplier
      extends MatchesBaseDescriptorSupplier {
    MatchesFileDescriptorSupplier() {}
  }

  private static final class MatchesMethodDescriptorSupplier
      extends MatchesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MatchesMethodDescriptorSupplier(String methodName) {
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
      synchronized (MatchesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MatchesFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getUpdateMatchMethod())
              .addMethod(getDeleteMatchMethod())
              .addMethod(getFindByUserIdMethod())
              .addMethod(getCreateMatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
