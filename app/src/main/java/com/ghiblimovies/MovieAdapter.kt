import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ghiblimovies.Movies
import com.ghiblimovies.R
import com.squareup.picasso.Picasso

class MovieAdapter(private val qqq : List<Movies>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var title : TextView = view.findViewById(R.id.movieTitleTextView)
        var tags : TextView = view.findViewById(R.id.tagsTextView)
        var description : TextView = view.findViewById(R.id.description)
        var cover: ImageView = view.findViewById(R.id.imageView)

        fun bind(movie: Movies){
            title.setText(movie.title)
            //tags.setText(movie.id)
            description.setText(movie.description)

            Picasso.get().load(movie.image).into(cover);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_panel, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(qqq.get(position))
    }

    override fun getItemCount(): Int {
        return qqq.size
    }
}