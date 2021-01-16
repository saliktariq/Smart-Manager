package app.smartmanager.ui.setup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import app.smartmanager.R;

public class NewProbeViewHolder extends RecyclerView.ViewHolder {
    private final TextView probeId;
    private final TextView probeName;
    private final TextView probeIdentification;

    public NewProbeViewHolder(@NonNull View itemView) {
        super(itemView);
        probeId = itemView.findViewById(R.id.rwProbeID);
        probeName = itemView.findViewById(R.id.rwProbeName);
        probeIdentification = itemView.findViewById(R.id.rwProbeIdentifier);
    }

    public void bind(String txtProbeId, String txtProbeName, String txtProbeIdentification){
        probeId.setText(txtProbeId);
        probeName.setText(txtProbeName);
        probeIdentification.setText(txtProbeIdentification);
    }

    static NewProbeViewHolder create(ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_probe, parent, false);
        return new NewProbeViewHolder(view);
    }
}
