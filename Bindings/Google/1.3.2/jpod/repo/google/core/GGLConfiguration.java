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
public class GGLConfiguration extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GGLConfiguration(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GGLConfiguration alloc();

	@Generated
	@Selector("androidClientID")
	public native String androidClientID();

	@Generated
	@Selector("apiKey")
	public native String apiKey();

	@Generated
	@Selector("bannerAdUnitID")
	public native String bannerAdUnitID();

	@Generated
	@Selector("clientID")
	public native String clientID();

	@Generated
	@Selector("gcmSenderID")
	public native String gcmSenderID();

	@Generated
	@Selector("googleAppID")
	public native String googleAppID();

	@Generated
	@Selector("init")
	public native GGLConfiguration init();

	@Generated
	@Selector("interstitialAdUnitID")
	public native String interstitialAdUnitID();

	@Generated
	@Selector("isAdsEnabled")
	public native boolean isAdsEnabled();

	@Generated
	@Selector("isAnalyticsEnabled")
	public native boolean isAnalyticsEnabled();

	@Generated
	@Selector("isAppInviteEnabled")
	public native boolean isAppInviteEnabled();

	@Generated
	@Selector("isGCMEnabled")
	public native boolean isGCMEnabled();

	@Generated
	@Selector("isMeasurementEnabled")
	public native boolean isMeasurementEnabled();

	@Generated
	@Selector("isSignInEnabled")
	public native boolean isSignInEnabled();

	@Generated
	@Selector("libraryVersionID")
	public native String libraryVersionID();

	@Generated
	@Selector("trackingID")
	public native String trackingID();
}