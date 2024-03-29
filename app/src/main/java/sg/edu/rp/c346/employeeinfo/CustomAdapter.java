package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Employee> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<Employee> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewJob);
        TextView tvSalary = rowView.findViewById(R.id.textViewPay);

        Employee currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getTitle());
        tvSalary.setText("" + currentVersion.getSalary());

        return rowView;
    }


}
