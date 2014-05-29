package mob.dev.gridview.app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by azu on 29/05/14.
 */
public class SelectorAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    public static Vector<BookInfo> bookVector;

    public SelectorAdapter(Activity a){
        layoutInflater = (LayoutInflater) a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inicializarVector();
    }

    private void inicializarVector() {
        bookVector = new Vector<BookInfo>();
        bookVector.add(new BookInfo(1,"Kappa", "Akutagawa", R.drawable.libro, "http://www.leemp3.com/leemp3/1/Kappa_akutagawa.mp3"));
        bookVector.add(new BookInfo(2,"Avecilla", "Alas Clarin, Leopoldo", R.drawable.libro, "http://www.leemp3.com/leemp3/Avecilla_alas.mp3"));
        bookVector.add(new BookInfo(3,"Divina Comedia", "Dante", R.drawable.libro, "http://www.leemp3.com/leemp3/8/Divina%20Comedia_alighier.mp3"));
        bookVector.add(new BookInfo(4,"Viejo Pancho, El", "Alonso y Trelles, José", R.drawable.libro, "http://www.leemp3.com/leemp3/1/viejo_pancho_trelles.mp3"));
        bookVector.add(new BookInfo(5,"Canción de Rolando", "Anónimo", R.drawable.libro, "http://www.leemp3.com/leemp3/Cancion%20de%20Rolando_anonimo.mp3"));
        bookVector.add(new BookInfo(6,"Matrimonio de Sabuesos", "Agata Christie", R.drawable.libro, "http://www.dcomg.upv.es/~jtomas/android/audiolibros/01.%20Matromonio%20De%20Sabuesos.mp3"));
        bookVector.add(new BookInfo(7,"La Iliada", "Homero", R.drawable.libro, "http://www.dcomg.upv.es/~jtomas/android/audiolibros/la-iliada-homero184950.mp3"));
    }

    @Override
    public int getCount() {
        return bookVector.size();
    }

    @Override
    public Object getItem(int i) {
        return bookVector.get(i);
    }

    @Override
    public long getItemId(int i) {
        return bookVector.get(i).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView audioLibroTextView;
        BookInfo bookInfo = bookVector.elementAt(position);
        View view = convertView;
        if(convertView == null){
            view = layoutInflater.inflate(R.layout.elemento_selector,null);
        }
        audioLibroTextView = (TextView) view.findViewById(R.id.titulo);
        imageView = (ImageView) view.findViewById(R.id.imageView1);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        audioLibroTextView.setText(bookInfo.getName());
        return view;
    }
}
