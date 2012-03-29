package parentalcontrol.parent.GUI;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class SMSSendActivityTest extends ActivityInstrumentationTestCase2<SMSSendActivity>{

	private LoginActivity mActivity;
	private String resourceString;
	private TextView mView;

	public LoginActivityTest() {
		super("parentalcontrol.parent.GUI", ParentdroidActivityTest.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
		mView = (TextView) mActivity.findViewById(parentalcontrol.parent.GUI.R.id.tvsmssend);
		resourceString = mActivity.getString(parentalcontrol.parent.GUI.R.string.hello);
	}

	public void testPreconditions() {
		assertNotNull(mView);
	}

	public void testText() {
		assertEquals(resourceString, (String) mView.getText());
	}
}
