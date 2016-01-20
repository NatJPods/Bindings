package com.intel.ocmock;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMAnyConstraint extends OCMConstraint {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMAnyConstraint(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMAnyConstraint alloc();

	@Generated
	@Selector("constraint")
	public static native OCMAnyConstraint constraint();

	@Generated
	@Selector("constraintWithSelector:onObject:")
	public static native OCMAnyConstraint constraintWithSelectorOnObject(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("constraintWithSelector:onObject:withValue:")
	public static native OCMAnyConstraint constraintWithSelectorOnObjectWithValue(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object anObject,
			@Mapped(ObjCObjectMapper.class) Object aValue);

	@Generated
	@Selector("init")
	public native OCMAnyConstraint init();
}