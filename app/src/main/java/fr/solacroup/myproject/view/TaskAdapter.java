package fr.solacroup.myproject.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import fr.solacroup.myproject.R;
import fr.solacroup.myproject.domain.Task;

public class TaskAdapter extends ArrayAdapter<Task> {

    private int ressourceId;

    public TaskAdapter(@NonNull Context context, int resource, @NonNull List<Task> objects) {
        super(context, resource, objects);
        this.ressourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Task task = getItem(position);
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(this.ressourceId,parent, false);
        }
        TextView taskfile = convertView.findViewById(R.id.task_title_text_view);
        taskfile.setText(task.getTitle());
        return convertView;
    }
}
