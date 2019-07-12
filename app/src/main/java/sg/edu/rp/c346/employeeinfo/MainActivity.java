package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> employeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvEmployee);

        employeeList = new ArrayList<>();

        employeeList.add(new Employee("John", "Software Technical Leader", 3400.0f));
        employeeList.add(new Employee("May", "Programmer", 2200.0f));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, employeeList);
        lvEmployee.setAdapter(adapter);

    }
}
