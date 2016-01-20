package com.intel.ocmock;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSException;
import ios.foundation.NSInvocation;
import ios.foundation.NSNotification;
import ios.foundation.NSValue;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMStubRecorder extends OCMRecorder {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMStubRecorder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("_andCall")
	@ObjCBlock(name = "call__andCall_ret")
	public native Block__andCall_ret _andCall();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block__andCall_ret {
		@Generated
		OCMStubRecorder call__andCall_ret(
				@Mapped(ObjCObjectMapper.class) Object arg0, SEL arg1);
	}

	@Generated
	@Selector("_andForwardToRealObject")
	@ObjCBlock(name = "call__andForwardToRealObject_ret")
	public native Block__andForwardToRealObject_ret _andForwardToRealObject();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block__andForwardToRealObject_ret {
		@Generated
		OCMStubRecorder call__andForwardToRealObject_ret();
	}

	@Generated
	@Selector("_andPost")
	@ObjCBlock(name = "call__andPost_ret")
	public native Block__andPost_ret _andPost();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block__andPost_ret {
		@Generated
		OCMStubRecorder call__andPost_ret(NSNotification arg0);
	}

	@Generated
	@Selector("_andReturn")
	@ObjCBlock(name = "call__andReturn_ret")
	public native Block__andReturn_ret _andReturn();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block__andReturn_ret {
		@Generated
		OCMStubRecorder call__andReturn_ret(NSValue arg0);
	}

	@Generated
	@Selector("_andThrow")
	@ObjCBlock(name = "call__andThrow_ret")
	public native Block__andThrow_ret _andThrow();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block__andThrow_ret {
		@Generated
		OCMStubRecorder call__andThrow_ret(NSException arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMStubRecorder alloc();

	@Generated
	@Selector("andCall:onObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andCallOnObject(SEL selector,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("andDo:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andDo(@ObjCBlock(name = "call_andDo") Block_andDo block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_andDo {
		@Generated
		void call_andDo(NSInvocation arg0);
	}

	@Generated
	@Selector("andForwardToRealObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andForwardToRealObject();

	@Generated
	@Selector("andPost:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andPost(NSNotification aNotification);

	@Generated
	@Selector("andReturn:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andReturn(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("andReturnValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andReturnValue(NSValue aValue);

	@Generated
	@Selector("andThrow:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object andThrow(NSException anException);

	@Generated
	@Selector("init")
	public native OCMStubRecorder init();

	@Generated
	@Selector("initWithMockObject:")
	public native OCMStubRecorder initWithMockObject(OCMockObject aMockObject);
}