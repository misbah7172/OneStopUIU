package com.example.onestopuiu;

import com.example.onestopuiu.util.ImageCache;
import com.example.onestopuiu.util.OrderSchedulerService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

import java.io.IOException;

public class OneStopUIUApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OneStopUIUApplication.class.getResource("login.fxml"));


        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        
        Scene scene = new Scene(fxmlLoader.load(), screenBounds.getWidth(), screenBounds.getHeight());
        stage.setTitle("OneStopUIU - Integrated Management System");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();


        OrderSchedulerService.getInstance().start();
    }

    @Override
    public void stop() throws Exception {

        OrderSchedulerService.getInstance().stop();


        ImageCache.shutdown();
        
        super.stop();
    }

    public static void main(String[] args) {
        launch();
    }
} 