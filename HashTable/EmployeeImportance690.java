package HashTable;

import java.util.HashMap;
import java.util.List;

public class EmployeeImportance690 {
    // Employee info
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    class Solution {
        public int getImportance(List<Employee> employees, int id) {
            HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();
            for (int i = 0; i < employees.size(); i++) {
                Employee auxEmployee = employees.get(i);
                employeeHashMap.put(auxEmployee.id, auxEmployee);
            }

            return sumRecursive(employeeHashMap, id);
        }


        public int sumRecursive(HashMap<Integer, Employee> map, int id) {
            Employee employee = map.get(id);
            int importance = employee.importance;
            for (Integer subordinate : employee.subordinates) {
                importance += sumRecursive(map, subordinate);
            }
            return importance;
        }

    }
}
