package mididrum;

import javax.sound.midi.*;
import java.io.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

// thanks http://stackoverflow.com/questions/6937760/java-getting-input-from-midi-keyboard
// also thanks http://stackoverflow.com/questions/10873590/in-java-using-switch-statement-with-a-range-of-value-in-each-case

public class MidiInputReceiver implements Receiver {
    public String name;
    public MidiInputReceiver(String name) {
        this.name = name;
    }
    @Override
    public void send(MidiMessage msg, long timeStamp) {
        byte[] aMsg = msg.getMessage();
       
        if(aMsg[2]==127){ // only work when the key is pressed initially
            //System.out.println("midi received");
            //System.out.println(aMsg[1]);
        } // 0 is something, velocity maybe? Who cares.
            // 1 is the note value. This is the important one.
            // 2 is pressed or not (0/100)
        
        if(aMsg[2]==127){ // only check if the key is initially being pressed
        if(isBetween(aMsg[1],0,7)){
            //System.out.println("case 1");
            try {
                String yourFile = MidiDrum.drumClips[0];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
            
        } else if(isBetween(aMsg[1],8,15)){
            //System.out.println("case 2");
            try {
                String yourFile = MidiDrum.drumClips[1];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
            
        } else if(isBetween(aMsg[1],16,23)){
           //System.out.println("case 3");
           try {
                String yourFile = MidiDrum.drumClips[2];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
           
        } else if(isBetween(aMsg[1],24,31)){
            //System.out.println("case 4");
            try {
                String yourFile = MidiDrum.drumClips[3];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
            
        } else if(isBetween(aMsg[1],32,39)){
           //System.out.println("case 5");
           try {
                String yourFile = MidiDrum.drumClips[4];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
           
        } else if(isBetween(aMsg[1],40,47)){
           //System.out.println("case 6");
           try {
                String yourFile = MidiDrum.drumClips[5];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
           
        } else if(isBetween(aMsg[1],48,55)){
            //System.out.println("case 7");
            try {
                String yourFile = MidiDrum.drumClips[6];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        } else if(isBetween(aMsg[1],56,63)){
           //System.out.println("case 8");
           try {
                String yourFile = MidiDrum.drumClips[7];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
           
        } else if(isBetween(aMsg[1],64,71)){
           //System.out.println("case 9");
           try {
                String yourFile = MidiDrum.drumClips[8];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
           
        } else if(isBetween(aMsg[1],72,79)){
           //System.out.println("case 10");
           try {
                String yourFile = MidiDrum.drumClips[9];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
           
        } else if(isBetween(aMsg[1],80,87)){
           //System.out.println("case 11");
           try {
                String yourFile = MidiDrum.drumClips[10];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        } else if(isBetween(aMsg[1],88,95)){
           //System.out.println("case 12");
           try {
                String yourFile = MidiDrum.drumClips[11];
                String sanitizedFile = yourFile.replace("%20", " ");
                InputStream in = new FileInputStream(sanitizedFile);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);         
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        } else if(isBetween(aMsg[1],96,103)){
           //System.out.println("case 13");
           System.out.println("Loading...");
           MidiDrum.drumClips[0] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/auxperc.wav").getPath();
           MidiDrum.drumClips[1] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/clap.wav").getPath();
           MidiDrum.drumClips[2] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/crash.wav").getPath();
           MidiDrum.drumClips[3] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/hihatclosed.wav").getPath();
           MidiDrum.drumClips[4] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/hihatopen.wav").getPath();
           MidiDrum.drumClips[5] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/kick.wav").getPath();
           MidiDrum.drumClips[6] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/ride.wav").getPath();
           MidiDrum.drumClips[7] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/rimshot.wav").getPath();
           MidiDrum.drumClips[8] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/snare.wav").getPath();
           MidiDrum.drumClips[9] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/tomhi.wav").getPath();
           MidiDrum.drumClips[10] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/tomlow.wav").getPath();
           MidiDrum.drumClips[11] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/tommid.wav").getPath(); 
           System.out.println("Roger Linn LM-2 Patch loaded.");
        } else if(isBetween(aMsg[1],104,111)){
           //System.out.println("case 14");
           System.out.println("Loading...");
           MidiDrum.drumClips[0] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/auxperc.wav").getPath();
           MidiDrum. drumClips[1] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/clap.wav").getPath();
           MidiDrum. drumClips[2] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/crash.wav").getPath();
           MidiDrum. drumClips[3] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/hihatclosed.wav").getPath();
           MidiDrum. drumClips[4] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/hihatopen.wav").getPath();
           MidiDrum. drumClips[5] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/kick.wav").getPath();
           MidiDrum. drumClips[6] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/ride.wav").getPath();
           MidiDrum. drumClips[7] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/rimshot.wav").getPath();
           MidiDrum. drumClips[8] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/snare.wav").getPath();
           MidiDrum. drumClips[9] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/tomhi.wav").getPath();
           MidiDrum. drumClips[10] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/tomlow.wav").getPath();
           MidiDrum. drumClips[11] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/tommid.wav").getPath();
           System.out.println("Roland TS-808 Patch loaded.");
        } else if(isBetween(aMsg[1],112,119)){
           System.out.println("case 15");
           System.out.println("Reserved for swapping drum machines");
        } else if(isBetween(aMsg[1],120,127)){
           System.out.println("case 16");
           System.out.println("Reserved for swapping drum machines");
        } else {
            System.out.println("How did you get here?");
            System.out.println("This is not my beautiful house.");
        }
    
        }
        //System.out.println();

    }
    public void close() {}
    
   public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
   }
}
