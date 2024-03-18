import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent {

  // constructor() { }

  // ngOnInit(): void {
  // }
  categories = ['Starters', 'Main Courses', 'Dessert', 'Beverages'];
  selectedCategory: string = '';
  menuItems = {
    'Starters': [
      { name: 'Starter 1', price: 5.99, imageUrl: 'https://img.taste.com.au/YjTrd97f/taste/2016/11/top-50-starters-117783-1.jpeg' },
      { name: 'Starter 2', price: 6.99, imageUrl: 'https://www.oyorooms.com/blog/wp-content/uploads/2018/07/shutterstock_423385612.jpg' }
    ],
    'Main Courses': [
      { name: 'Main Course 1', price: 10.99, imageUrl: 'path_to_image3' },
      { name: 'Main Course 2', price: 12.99, imageUrl: 'path_to_image4' }
    ],
    'Dessert': [
      { name: 'Dessert 1', price: 4.99, imageUrl: 'path_to_image5' },
      { name: 'Dessert 2', price: 5.99, imageUrl: 'path_to_image6' }
    ],
    'Beverages': [
      { name: 'Beverage 1', price: 2.99, imageUrl: 'path_to_image7' },
      { name: 'Beverage 2', price: 3.99, imageUrl: 'path_to_image8' }
    ]
  };
 
  selectCategory(category: string) {
    this.selectedCategory = category;
  }
 
  getMenuItems(category: string) {
    return this.menuItems[category];
  }
 
  addToCart(item: any) {
    // Implement add to cart functionality here
    console.log('Added to cart:', item);
  }
}

