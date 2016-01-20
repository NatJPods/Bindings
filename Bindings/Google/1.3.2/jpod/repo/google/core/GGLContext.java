package jpod.repo.google.core;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSError;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GGLContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GGLContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GGLContext alloc();

	@Generated
	@Selector("configuration")
	public native GGLConfiguration configuration();

	@Generated
	@Selector("configureWithError:")
	public native void configureWithError(Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native GGLContext init();

	@Generated
	@Selector("sharedInstance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedInstance();

	@Generated
	@Selector("tracker")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object tracker();
}