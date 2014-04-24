package mididrum;
import javax.sound.midi.*;
/**
 *
 * @author Cain
 * 
 * Tyvm to http://stackoverflow.com/questions/1485307/java-midi-getting-data-from-piano/1485347#1485347
 * and http://docs.oracle.com/javase/tutorial/sound/MIDI-synth.html
 * and http://stackoverflow.com/questions/6937760/java-getting-input-from-midi-keyboard
 * 
 * Also this:http://stackoverflow.com/questions/23223116/receiving-com-sun-media-sound-fastshortmessage-from-midi-controller-in-java-how
 *      but that's my SO account asking the question.
 * 
 * Drum machine sounds for the 808 and LM-2 came from here
 *      http://trashaudio.com/2012/10/linndrum-lm2-samples/
 *      http://trashaudio.com/2010/01/roland-tr-808-sample-pack/
 *  primarily because those are my two favourite drum machines
 *  but also because they were $3 each and I like the guys at TrashAudio
 * 
 *   
 */


public class MidiDrum {

    public static String[] drumClips = new String[12];
    
    public static void main(String[] args) {
        
        System.out.println("System initialized.");
        
        // There are 128 possible notes, 0-127
        // There are 12 possible drum sounds
        //  and four possible drum banks
                // Snare 
                // Kick
                // Hi Hat Open
                // Hi Hat Closed
                // Low tom
                // Mid tom 
                // Hi tom
                // Cymbal 1
                // Cymbal 2
                // Clap
                // Misc perc
        // Each one is played from an 8-note range
        // covering all 127 possible notes
        // Most devices can be tuned so tune yr device and deal with it.   
        
        // There are two different drumkits so far
        // Based off of the Roland TR-808 and the Linn LN-2
        
        MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
        for(int i=0;i<infos.length;i++)
        {
            System.out.println(i+": "+infos[i].getName() + " - " + infos[i].getDescription());
        }
        System.out.print("Which input device? ");
        int x = Integer.parseInt(jpb.SimpleIO.readLine());  
        
        // Assign the midi device to be used.
        MidiDevice inputDevice;
        try {
            inputDevice = MidiSystem.getMidiDevice(infos[x]);
            inputDevice.open();
            System.out.println(inputDevice.getDeviceInfo()+" Was Opened");
        } catch (MidiUnavailableException e){
            System.out.println(e);
            return;
        }

        Transmitter trans;
        
        try {
            trans = inputDevice.getTransmitter();
            trans.setReceiver(new MidiInputReceiver(inputDevice.getDeviceInfo().toString()));
        } catch (MidiUnavailableException e){
            return;
        }
        
        System.out.println("Which initial drum machine? device? ");
        System.out.println("1\tRoger Linn LM-2");
        System.out.println("2\tRoland TS-808");
        int drumMachineChoice = Integer.parseInt(jpb.SimpleIO.readLine());
                
        
        if(drumMachineChoice == 1){
            drumClips[0] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/auxperc.wav").getPath();
            drumClips[1] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/clap.wav").getPath();
            drumClips[2] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/crash.wav").getPath();
            drumClips[3] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/hihatclosed.wav").getPath();
            drumClips[4] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/hihatopen.wav").getPath();
            drumClips[5] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/kick.wav").getPath();
            drumClips[6] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/ride.wav").getPath();
            drumClips[7] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/rimshot.wav").getPath();
            drumClips[8] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/snare.wav").getPath();
            drumClips[9] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/tomhi.wav").getPath();
            drumClips[10] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/tomlow.wav").getPath();
            drumClips[11] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/LM2/tommid.wav").getPath(); 
            System.out.println("Roger Linn LM-2 Patch loaded.");
        } else {
            drumClips[0] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/auxperc.wav").getPath();
            drumClips[1] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/clap.wav").getPath();
            drumClips[2] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/crash.wav").getPath();
            drumClips[3] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/hihatclosed.wav").getPath();
            drumClips[4] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/hihatopen.wav").getPath();
            drumClips[5] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/kick.wav").getPath();
            drumClips[6] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/ride.wav").getPath();
            drumClips[7] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/rimshot.wav").getPath();
            drumClips[8] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/snare.wav").getPath();
            drumClips[9] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/tomhi.wav").getPath();
            drumClips[10] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/tomlow.wav").getPath();
            drumClips[11] = MidiInputReceiver.class.getClassLoader().getResource("mididrum/Resources/TR808/tommid.wav").getPath(); 
            System.out.println("Roland TS-808 Patch loaded.");
        }
        
        System.out.println("Listening...");
        while(true){
            // Infinite loop to listen to the midi
        }
    }
}
