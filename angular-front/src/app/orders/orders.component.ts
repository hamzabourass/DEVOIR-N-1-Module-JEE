import {Component, OnInit} from '@angular/core';
import {CommonModule} from "@angular/common";
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Component({
  selector: 'app-orders',
  standalone: true,
  imports: [CommonModule,HttpClientModule],
  templateUrl: './orders.component.html',
  styleUrl: './orders.component.css'
})
export class OrdersComponent implements OnInit{

  orders:any;
  constructor(private http : HttpClient) {
  }
  ngOnInit(): void {
    this.http.get("http://localhost:8282/COMMANDE-SERVICE/commandes")
      .subscribe({
        next: data =>{
          this.orders = data;
        },
        error: err => {
          console.log((err));
        }
      })
  }

}
