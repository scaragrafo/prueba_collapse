package mentorskill.demoInterfaces;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carlos ardukids on 15/06/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    List<Game> games;

    public RecyclerAdapter(List<Game>games){
        this.games=games;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name_game.setText(games.get(position).name_game);
        holder.view.setText(games.get(position).view);
        holder.image.setImageResource(games.get(position).photoID1);
        holder.like.setImageResource(games.get(position).photoID2);

    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
      super.onAttachedToRecyclerView(recyclerView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name_game,view;
        public ImageView image,like;
        public CardView cardView;

        public ViewHolder(View itemVIew){
            super(itemVIew);
            cardView=(CardView)itemVIew.findViewById(R.id.cardView);
            name_game=(TextView)itemVIew.findViewById(R.id.name_game);
            view=(TextView)itemVIew.findViewById(R.id.view);
            image=(ImageView)itemVIew.findViewById(R.id.image);
            like=(ImageView)itemVIew.findViewById(R.id.like);


        }
    }
}
