import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ghiblimovies.Movie
import com.ghiblimovies.R

class MovieAdapter(private val qqq : ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var title : TextView = view.findViewById(R.id.movieTitleTextView)
        var tags : TextView = view.findViewById(R.id.tagsTextView)
        var description : TextView = view.findViewById(R.id.description)

        fun bind(movie: Movie){
            title.setText(movie.movie_title)
            tags.setText(movie.movie_tags.toString())
            description.setText("adjsn")
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