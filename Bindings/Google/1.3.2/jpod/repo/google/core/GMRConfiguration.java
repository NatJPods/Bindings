package jpod.repo.google.core;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GMRConfiguration extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GMRConfiguration(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GMRConfiguration alloc();

	@Generated
	@Selector("init")
	public native GMRConfiguration init();

	@Generated
	@Selector("setIsEnabled:")
	public native void setIsEnabled(boolean isEnabled);

	@Generated
	@Selector("sharedInstance")
	public static native GMRConfiguration sharedInstance();
}