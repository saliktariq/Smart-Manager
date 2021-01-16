package app.smartmanager.ui.setup;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import app.smartmanager.datalayer.entity.Probe;

public class NewProbeListAdapter extends ListAdapter<Probe, NewProbeViewHolder> {
    public NewProbeListAdapter(@NonNull DiffUtil.ItemCallback<Probe> diffCallback){
        super(diffCallback);
    }
    @Override
    public NewProbeViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        return NewProbeViewHolder.create(parent);
    }
    @Override
    public void onBindViewHolder(NewProbeViewHolder holder, int position){
        Probe current = getItem(position);
        holder.bind(String.valueOf(current.getProbeID()),current.getName(),current.getIdentifier());
    }

    static class ProbeDiff extends DiffUtil.ItemCallback<Probe>{

        @Override
        public boolean areItemsTheSame(@NonNull Probe oldItem, @NonNull Probe newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Probe oldItem, @NonNull Probe newItem) {
            return oldItem.getProbeID() == newItem.getProbeID();
        }
    }
}
