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
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("OCMock")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OCMBlockConstraint extends OCMConstraint {
	static {
		NatJ.register();
	}

	@Generated
	protected OCMBlockConstraint(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native OCMBlockConstraint alloc();

	@Generated
	@Selector("constraint")
	public static native OCMBlockConstraint constraint();

	@Generated
	@Selector("constraintWithSelector:onObject:")
	public static native OCMBlockConstraint constraintWithSelectorOnObject(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("constraintWithSelector:onObject:withValue:")
	public static native OCMBlockConstraint constraintWithSelectorOnObjectWithValue(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object anObject,
			@Mapped(ObjCObjectMapper.class) Object aValue);

	@Generated
	@Selector("init")
	public native OCMBlockConstraint init();

	@Generated
	@Selector("initWithConstraintBlock:")
	public native OCMBlockConstraint initWithConstraintBlock(
			@ObjCBlock(name = "call_initWithConstraintBlock") Block_initWithConstraintBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithConstraintBlock {
		@Generated
		boolean call_initWithConstraintBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}
}