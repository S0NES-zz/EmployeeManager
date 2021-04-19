import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor(private http: HttpClient) {}

  private apiServerUrl = '';

  public getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/all`);
  }
  public addEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(
      `${this.apiServerUrl}/employee/add`,
      employee
    );
  }
  public updateEmployee(employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(
      `${this.apiServerUrl}/employee/update`,
      employee
    );
  }
  public deleteEmployee(employeeId: number): Observable<void> {
    return this.http.delete<void>(
      `${this.apiServerUrl}/employee/update${employeeId}`
    );
  }
}
