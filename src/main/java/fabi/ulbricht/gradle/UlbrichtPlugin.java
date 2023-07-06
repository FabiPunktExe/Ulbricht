package fabi.ulbricht.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class UlbrichtPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        UlbrichtExtension extension = target.getExtensions().create("ulbricht", UlbrichtExtension.class);
        target.getTasks().register("ulbricht", UlbrichtTask.class).configure(task -> {
            task.input = extension.input;
            task.output = extension.output;
        });
    }
}