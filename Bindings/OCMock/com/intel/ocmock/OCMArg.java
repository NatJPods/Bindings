package com.intel.ocmock;


import com.intel.inde.moe.natj.c.ann.Variadic;
import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.ReferenceInfo;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.general.ptr.VoidPtr;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCObject;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSValue;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMArg extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMArg(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMArg alloc();

	@Generated
	@Selector("any")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object any();

	@Generated
	@Selector("anyObjectRef")
	@ReferenceInfo(type = ObjCObject.class)
	public static native Ptr<ObjCObject> anyObjectRef();

	@Generated
	@Selector("anyPointer")
	public static native VoidPtr anyPointer();

	@Generated
	@Selector("anySelector")
	public static native SEL anySelector();

	@Generated
	@Selector("checkWithBlock:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object checkWithBlock(
			@ObjCBlock(name = "call_checkWithBlock") Block_checkWithBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_checkWithBlock {
		@Generated
		boolean call_checkWithBlock(@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@Selector("checkWithSelector:onObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object checkWithSelectorOnObject(SEL selector,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("defaultValue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValue();

	@Generated
	@Selector("init")
	public native OCMArg init();

	@Generated
	@Selector("invokeBlock")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object invokeBlock();

	@Generated
	@Variadic()
	@Selector("invokeBlockWithArgs:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object invokeBlockWithArgs(
			@Mapped(ObjCObjectMapper.class) Object first, Object... varargs);

	@Generated
	@Selector("isEqual:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object isEqual_static(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("isKindOfClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object isKindOfClass_static(Class cls);

	@Generated
	@Selector("isNil")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object isNil();

	@Generated
	@Selector("isNotEqual:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object isNotEqual(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("isNotNil")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object isNotNil();

	@Generated
	@Selector("resolveSpecialValues:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object resolveSpecialValues(NSValue value);

	@Generated
	@Selector("setTo:")
	@ReferenceInfo(type = ObjCObject.class)
	public static native Ptr<ObjCObject> setTo(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setToValue:")
	public static native VoidPtr setToValue(NSValue value);
}