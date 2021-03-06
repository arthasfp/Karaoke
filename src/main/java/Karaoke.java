import com.teamtreehouse.model.SongBook;

public class Karaoke {

    public static void main(String[] args) {
        SongBook songBook = new SongBook();
        songBook.importFrom("songs.txt");
        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();
        System.out.println("Saving book...");
        songBook.exportTo("songs.txt");
    }
}



/*
Michael Jackson|Beat It|https://www.youtube.com/watch?v=SaEC9i9QOvk
Jackson 5|I want you back|https://www.youtube.com/watch?v=G5ey0OPBxEE
Jackson 5|ABC|https://www.youtube.com/watch?v=oLRZZX9D7Ck
Journey|Don't Stop Believin'|https://www.youtube.com/watch?v=P7kDvaLUUcM
Wilson Phillips|Hold On|https://www.youtube.com/watch?v=UJP_mVu48OU
Taylor Swift|Shake It Off|https://www.youtube.com/watch?v=-i5MU14JLdw
Katy Perry|Roar|https://www.youtube.com/watch?v=uFmocJG1ipA
Ritchie Valens|La Bamba|https://www.youtube.com/watch?v=vvB6RKJAwpM
U2|With Or Without You|https://www.youtube.com/watch?v=Ws0mDfYd8UQ
U2|I Still Haven't Found|https://www.youtube.com/watch?v=0po5HpEoAS4
Jackson 5|Rockin' Robin|https://www.youtube.com/watch?v=sbk_g0NR-NU
The Cure|Friday I'm in Love|https://www.youtube.com/watch?v=GMw2Jp4GnCI
The Cure|Boys Don't Cry|https://www.youtube.com/watch?v=5lZpc1KReks
The Cure|Just Like Heaven|https://www.youtube.com/watch?v=pZxIyvsZlPk
The Cure|Love Song|https://www.youtube.com/watch?v=ogi6aMOYOEQ

 */