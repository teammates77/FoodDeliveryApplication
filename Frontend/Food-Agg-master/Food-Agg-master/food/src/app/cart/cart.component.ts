import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { OrderDetailsService } from '../order-details.service';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  public product: any = [];
  public grandTotal: number = 0;
  constructor(private cartservice: CartService, private foods: OrderDetailsService) {}
  ngOnInit(): void {
    // this.cartservice.getProduct().subscribe(res=> {
    //   this.product = res;
    //   this.grandTotal = this.cartservice.getTotalPrice()
    // })
    
  }
  removeItem(item:any) {
    this.cartservice.removeCartItem(item)
  }

  emptyCart () {
    this.cartservice.removeAllCart()
  }

}

