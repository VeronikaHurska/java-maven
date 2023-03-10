package task3.MusicInstrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drums implements Instrument{
    private int size;

    public void play(){
        System.out.println("plays drum with size "+size);
    }
}
