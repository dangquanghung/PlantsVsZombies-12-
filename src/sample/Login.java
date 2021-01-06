package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Login extends Application implements Serializable {
    private static ArrayList<User> users=new ArrayList<>();
    public static LoginManager l=new LoginManager();
    private transient Stage guiStage;
    private transient Scene scene;
    private transient Parent root;
	private static Clip clip;
    public Login() throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        scene=new Scene(root,950,600);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        guiStage=primaryStage;
        primaryStage.setTitle("Plants vs Zombies");
        primaryStage.setScene(scene);
        primaryStage.show();
        music("menu.wav");
    }

    public void music(String filepath){
    	try
    	{
    		this.clip = AudioSystem.getClip();
    		clip.open(AudioSystem.getAudioInputStream(getClass().getResource(filepath)));
    		clip.start();
    		clip.loop(clip.LOOP_CONTINUOUSLY);
    
    	}
    	catch (UnsupportedAudioFileException e1) { }
		catch (IOException e2) { } 
		catch (LineUnavailableException e3) { 
    	}
    }
    public static void stopMusic() {
    	clip.stop();
    	clip.close();
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        l.deserialize();
        launch(args);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> u) {
        users = u;
    }
}