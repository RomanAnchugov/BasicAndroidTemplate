package romananchugov.ru.costscheduler;

import android.app.Application;

import romananchugov.ru.costscheduler.dagger.AppComponent;
import romananchugov.ru.costscheduler.dagger.DaggerAppComponent;

public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();

    public static MyApplication INSTANCE;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder().build();
        }
        return appComponent;
    }
}
