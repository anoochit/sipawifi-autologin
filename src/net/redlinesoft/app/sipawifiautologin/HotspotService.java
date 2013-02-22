package net.redlinesoft.app.sipawifiautologin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class HotspotService extends Service {

	/* (non-Javadoc)
	 * @see android.app.Service#onBind(android.content.Intent)
	 */
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.d("LOG","Service Create");
		super.onCreate(); 
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.d("LOG","Service Destroy");
		super.onDestroy(); 
	}
 

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.d("LOG","Service start");
		return super.onStartCommand(intent, flags, startId);		
	}
	
	

}
