# No Internet Connection Dialog

This is to check and display a NoInternetConnection Dialog when the application starts or in between the running application.

# Steps
Follow the steps or instructions to build a successfull NoInternetConnectionDialog
Two classes are needed to check the InternetConnectionStatus
ConnectivityManager and NetworkInfo.

## Step 1
Add 3 permissions in the android project
```html
<user-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<user-permission android:name="android.permission.INTERNET"/>
<user-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
```
## Step 2
Create a private function with boolean return type below the OnCreate in the activity
```html
private boolean amIConnected() {
// A manager which checks for the connection of Connectivity to a system service
	ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
// This is to check the Device is connected to internet or not
NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
// This will return true or false
return activeNetworkInfo != null && activeNetworkInfo.isConnected();
}
```
## Step 3
Call the function in a if statement and check it is true or false
Remove the contextView from the onCreate function and paste in the else condition.

```html
        if(!amIConnected())
        {
            Log.i("TRUE","User is connected");

            // Create an Alert Dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            // Set the Alert Dialog Message
            builder.setMessage("No Internet Connection")
                    .setCancelable(false)
                    .setPositiveButton("Retry",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    // Restart the Activity
                                    Intent intent = getIntent();
                                    finish();
                                    startActivity(intent);
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        else
        {
            Log.i("TRUE","User is NOT Connected");
            setContentView(R.layout.activity_main);
        }

```
So this is to print the connection status of the device weather the user is connected or not.



# References
https://youtu.be/VM0RR6zhYY0
http://www.androidbegin.com/tutorial/android-check-internet-connection/

