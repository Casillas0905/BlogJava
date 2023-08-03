package GrpcClasses.Category;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Category.proto")
public final class CategoryGrpcGrpc {

  private CategoryGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Category.CategoryGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Category.Category.CategoryModelGrpc,
      GrpcClasses.Category.Category.Empty> getSaveCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCategory",
      requestType = GrpcClasses.Category.Category.CategoryModelGrpc.class,
      responseType = GrpcClasses.Category.Category.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Category.Category.CategoryModelGrpc,
      GrpcClasses.Category.Category.Empty> getSaveCategoryMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Category.Category.CategoryModelGrpc, GrpcClasses.Category.Category.Empty> getSaveCategoryMethod;
    if ((getSaveCategoryMethod = CategoryGrpcGrpc.getSaveCategoryMethod) == null) {
      synchronized (CategoryGrpcGrpc.class) {
        if ((getSaveCategoryMethod = CategoryGrpcGrpc.getSaveCategoryMethod) == null) {
          CategoryGrpcGrpc.getSaveCategoryMethod = getSaveCategoryMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Category.Category.CategoryModelGrpc, GrpcClasses.Category.Category.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Category.Category.CategoryModelGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Category.Category.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryGrpcMethodDescriptorSupplier("saveCategory"))
              .build();
        }
      }
    }
    return getSaveCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Category.Category.Empty,
      GrpcClasses.Category.Category.CategoryModelGrpc> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = GrpcClasses.Category.Category.Empty.class,
      responseType = GrpcClasses.Category.Category.CategoryModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Category.Category.Empty,
      GrpcClasses.Category.Category.CategoryModelGrpc> getFindAllMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Category.Category.Empty, GrpcClasses.Category.Category.CategoryModelGrpc> getFindAllMethod;
    if ((getFindAllMethod = CategoryGrpcGrpc.getFindAllMethod) == null) {
      synchronized (CategoryGrpcGrpc.class) {
        if ((getFindAllMethod = CategoryGrpcGrpc.getFindAllMethod) == null) {
          CategoryGrpcGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Category.Category.Empty, GrpcClasses.Category.Category.CategoryModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Category.Category.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Category.Category.CategoryModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryGrpcMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Category.Category.GetById,
      GrpcClasses.Category.Category.CategoryModelGrpc> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Category.Category.GetById.class,
      responseType = GrpcClasses.Category.Category.CategoryModelGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Category.Category.GetById,
      GrpcClasses.Category.Category.CategoryModelGrpc> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Category.Category.GetById, GrpcClasses.Category.Category.CategoryModelGrpc> getFindByIdMethod;
    if ((getFindByIdMethod = CategoryGrpcGrpc.getFindByIdMethod) == null) {
      synchronized (CategoryGrpcGrpc.class) {
        if ((getFindByIdMethod = CategoryGrpcGrpc.getFindByIdMethod) == null) {
          CategoryGrpcGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Category.Category.GetById, GrpcClasses.Category.Category.CategoryModelGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Category.Category.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Category.Category.CategoryModelGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryGrpcMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryGrpcStub>() {
        @java.lang.Override
        public CategoryGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryGrpcStub(channel, callOptions);
        }
      };
    return CategoryGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryGrpcBlockingStub>() {
        @java.lang.Override
        public CategoryGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryGrpcBlockingStub(channel, callOptions);
        }
      };
    return CategoryGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryGrpcFutureStub>() {
        @java.lang.Override
        public CategoryGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryGrpcFutureStub(channel, callOptions);
        }
      };
    return CategoryGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CategoryGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveCategory(GrpcClasses.Category.Category.CategoryModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCategoryMethod(), responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.Category.Category.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.CategoryModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Category.Category.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.CategoryModelGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Category.Category.CategoryModelGrpc,
                GrpcClasses.Category.Category.Empty>(
                  this, METHODID_SAVE_CATEGORY)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Category.Category.Empty,
                GrpcClasses.Category.Category.CategoryModelGrpc>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Category.Category.GetById,
                GrpcClasses.Category.Category.CategoryModelGrpc>(
                  this, METHODID_FIND_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CategoryGrpcStub extends io.grpc.stub.AbstractAsyncStub<CategoryGrpcStub> {
    private CategoryGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveCategory(GrpcClasses.Category.Category.CategoryModelGrpc request,
        io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.Category.Category.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.CategoryModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Category.Category.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.CategoryModelGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CategoryGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<CategoryGrpcBlockingStub> {
    private CategoryGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Category.Category.Empty saveCategory(GrpcClasses.Category.Category.CategoryModelGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Category.Category.CategoryModelGrpc> findAll(
        GrpcClasses.Category.Category.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Category.Category.CategoryModelGrpc findById(GrpcClasses.Category.Category.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CategoryGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<CategoryGrpcFutureStub> {
    private CategoryGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Category.Category.Empty> saveCategory(
        GrpcClasses.Category.Category.CategoryModelGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Category.Category.CategoryModelGrpc> findById(
        GrpcClasses.Category.Category.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_CATEGORY = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_FIND_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoryGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoryGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_CATEGORY:
          serviceImpl.saveCategory((GrpcClasses.Category.Category.CategoryModelGrpc) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.Empty>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((GrpcClasses.Category.Category.Empty) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.CategoryModelGrpc>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Category.Category.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Category.Category.CategoryModelGrpc>) responseObserver);
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

  private static abstract class CategoryGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Category.Category.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryGrpc");
    }
  }

  private static final class CategoryGrpcFileDescriptorSupplier
      extends CategoryGrpcBaseDescriptorSupplier {
    CategoryGrpcFileDescriptorSupplier() {}
  }

  private static final class CategoryGrpcMethodDescriptorSupplier
      extends CategoryGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoryGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (CategoryGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryGrpcFileDescriptorSupplier())
              .addMethod(getSaveCategoryMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getFindByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
