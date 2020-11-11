package com.musa.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class bookAdapter extends RecyclerView.Adapter<bookAdapter.ViewHolder> {
    private List<book> Promoted;
    private Context context;
    String description, url;

    public bookAdapter(Context applicationContext, List<book> bookArrayList) {
        this.context = applicationContext;
        this.Promoted = bookArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.books, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.title.setText(Promoted.get(i).getTitle());
        description = Promoted.get(i).getDescription();
        if (description.length() > 200) {
            viewHolder.titleDetail.setText(description.substring(0, 200));
        } else {
            viewHolder.titleDetail.setText(description);
        }
        Picasso.with(context)
                .load(Promoted.get(i).getImageView()).placeholder(R.drawable.action3)
                        .into(viewHolder.imageView);
    }



    @Override
    public int getItemCount() {
        return Promoted.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView imageView;
        // ImageView null;
        private TextView titleDetail;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            imageView = (ImageView) view.findViewById(R.id.cover);
            titleDetail = (TextView)view.findViewById(R.id.titldetail);

            //on book click
           /* bookView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Promoted.get(pos).getHtmlUrl()));
                        v.getContext().startActivity(intent);
                    }
                }

            }); */
        }
    }
}