package GrpcClasses.Event;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Event.proto")
public final class EventsGrpc {

  private EventsGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Event.Events";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.Event.Empty,
      GrpcClasses.Event.Event.EventModel> getFindAllEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllEvents",
      requestType = GrpcClasses.Event.Event.Empty.class,
      responseType = GrpcClasses.Event.Event.EventModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.Event.Empty,
      GrpcClasses.Event.Event.EventModel> getFindAllEventsMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.Event.Empty, GrpcClasses.Event.Event.EventModel> getFindAllEventsMethod;
    if ((getFindAllEventsMethod = EventsGrpc.getFindAllEventsMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getFindAllEventsMethod = EventsGrpc.getFindAllEventsMethod) == null) {
          EventsGrpc.getFindAllEventsMethod = getFindAllEventsMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.Event.Empty, GrpcClasses.Event.Event.EventModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.EventModel.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("findAllEvents"))
              .build();
        }
      }
    }
    return getFindAllEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventIdRequest,
      GrpcClasses.Event.Event.EventModel> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Event.Event.EventIdRequest.class,
      responseType = GrpcClasses.Event.Event.EventModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventIdRequest,
      GrpcClasses.Event.Event.EventModel> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventIdRequest, GrpcClasses.Event.Event.EventModel> getFindByIdMethod;
    if ((getFindByIdMethod = EventsGrpc.getFindByIdMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getFindByIdMethod = EventsGrpc.getFindByIdMethod) == null) {
          EventsGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.Event.EventIdRequest, GrpcClasses.Event.Event.EventModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.EventIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.EventModel.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventModel,
      GrpcClasses.Event.Event.Empty> getSaveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveEvent",
      requestType = GrpcClasses.Event.Event.EventModel.class,
      responseType = GrpcClasses.Event.Event.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventModel,
      GrpcClasses.Event.Event.Empty> getSaveEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventModel, GrpcClasses.Event.Event.Empty> getSaveEventMethod;
    if ((getSaveEventMethod = EventsGrpc.getSaveEventMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getSaveEventMethod = EventsGrpc.getSaveEventMethod) == null) {
          EventsGrpc.getSaveEventMethod = getSaveEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.Event.EventModel, GrpcClasses.Event.Event.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.EventModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("saveEvent"))
              .build();
        }
      }
    }
    return getSaveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventModel,
      GrpcClasses.Event.Event.Empty> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEvent",
      requestType = GrpcClasses.Event.Event.EventModel.class,
      responseType = GrpcClasses.Event.Event.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventModel,
      GrpcClasses.Event.Event.Empty> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventModel, GrpcClasses.Event.Event.Empty> getUpdateEventMethod;
    if ((getUpdateEventMethod = EventsGrpc.getUpdateEventMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getUpdateEventMethod = EventsGrpc.getUpdateEventMethod) == null) {
          EventsGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.Event.EventModel, GrpcClasses.Event.Event.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.EventModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("updateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventIdRequest,
      GrpcClasses.Event.Event.Empty> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEvent",
      requestType = GrpcClasses.Event.Event.EventIdRequest.class,
      responseType = GrpcClasses.Event.Event.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventIdRequest,
      GrpcClasses.Event.Event.Empty> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.Event.EventIdRequest, GrpcClasses.Event.Event.Empty> getDeleteEventMethod;
    if ((getDeleteEventMethod = EventsGrpc.getDeleteEventMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getDeleteEventMethod = EventsGrpc.getDeleteEventMethod) == null) {
          EventsGrpc.getDeleteEventMethod = getDeleteEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.Event.EventIdRequest, GrpcClasses.Event.Event.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.EventIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Event.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("deleteEvent"))
              .build();
        }
      }
    }
    return getDeleteEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsStub>() {
        @java.lang.Override
        public EventsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsStub(channel, callOptions);
        }
      };
    return EventsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsBlockingStub>() {
        @java.lang.Override
        public EventsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsBlockingStub(channel, callOptions);
        }
      };
    return EventsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsFutureStub>() {
        @java.lang.Override
        public EventsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsFutureStub(channel, callOptions);
        }
      };
    return EventsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EventsImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllEvents(GrpcClasses.Event.Event.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.EventModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllEventsMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Event.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.EventModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveEvent(GrpcClasses.Event.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEvent(GrpcClasses.Event.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    public void deleteEvent(GrpcClasses.Event.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Event.Event.Empty,
                GrpcClasses.Event.Event.EventModel>(
                  this, METHODID_FIND_ALL_EVENTS)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.Event.EventIdRequest,
                GrpcClasses.Event.Event.EventModel>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getSaveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.Event.EventModel,
                GrpcClasses.Event.Event.Empty>(
                  this, METHODID_SAVE_EVENT)))
          .addMethod(
            getUpdateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.Event.EventModel,
                GrpcClasses.Event.Event.Empty>(
                  this, METHODID_UPDATE_EVENT)))
          .addMethod(
            getDeleteEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.Event.EventIdRequest,
                GrpcClasses.Event.Event.Empty>(
                  this, METHODID_DELETE_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class EventsStub extends io.grpc.stub.AbstractAsyncStub<EventsStub> {
    private EventsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsStub(channel, callOptions);
    }

    /**
     */
    public void findAllEvents(GrpcClasses.Event.Event.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.EventModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Event.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.EventModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEvent(GrpcClasses.Event.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(GrpcClasses.Event.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEvent(GrpcClasses.Event.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventsBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventsBlockingStub> {
    private EventsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Event.Event.EventModel> findAllEvents(
        GrpcClasses.Event.Event.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.Event.EventModel findById(GrpcClasses.Event.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.Event.Empty saveEvent(GrpcClasses.Event.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.Event.Empty updateEvent(GrpcClasses.Event.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.Event.Empty deleteEvent(GrpcClasses.Event.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventsFutureStub extends io.grpc.stub.AbstractFutureStub<EventsFutureStub> {
    private EventsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.Event.EventModel> findById(
        GrpcClasses.Event.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.Event.Empty> saveEvent(
        GrpcClasses.Event.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.Event.Empty> updateEvent(
        GrpcClasses.Event.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.Event.Empty> deleteEvent(
        GrpcClasses.Event.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_EVENTS = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_SAVE_EVENT = 2;
  private static final int METHODID_UPDATE_EVENT = 3;
  private static final int METHODID_DELETE_EVENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_EVENTS:
          serviceImpl.findAllEvents((GrpcClasses.Event.Event.Empty) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.EventModel>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Event.Event.EventIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.EventModel>) responseObserver);
          break;
        case METHODID_SAVE_EVENT:
          serviceImpl.saveEvent((GrpcClasses.Event.Event.EventModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((GrpcClasses.Event.Event.EventModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty>) responseObserver);
          break;
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((GrpcClasses.Event.Event.EventIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.Event.Empty>) responseObserver);
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

  private static abstract class EventsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Event.Event.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Events");
    }
  }

  private static final class EventsFileDescriptorSupplier
      extends EventsBaseDescriptorSupplier {
    EventsFileDescriptorSupplier() {}
  }

  private static final class EventsMethodDescriptorSupplier
      extends EventsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventsMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventsFileDescriptorSupplier())
              .addMethod(getFindAllEventsMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getSaveEventMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getDeleteEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
