import { Component, OnInit,  Input } from '@angular/core';
import { MenuItem } from '../menu/menu-item.model';
import { CartService } from '../cart.service';
@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.scss']
})
export class ItemComponent {

  // constructor() { }

  // ngOnInit(): void {
  // }
  @Input() item: MenuItem;

  constructor(private cartService: CartService) {}

  addToCart(): void {
    this.cartService.addToCarts(this.item);
  }
}
