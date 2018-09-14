package romananchugov.ru.costscheduler.dagger;

import javax.inject.Singleton;

import dagger.Component;
import romananchugov.ru.costscheduler.MainActivity;

@Singleton
@Component(modules = {NavigationModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
