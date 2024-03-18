// import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class MenuService {

//   constructor() { }
// }
// src/app/menu.service.ts
import { Injectable } from '@angular/core';
// import { MenuItem } from './menu-item.model';
import { MenuItem } from './menu/menu-item.model';
@Injectable({
  providedIn: 'root',
})
export class MenuService {
  private menuItems: MenuItem[] = [
    { id: 1, name: 'Starter 1', category: 'starters', price: 10, imageUrl: 'https://img.taste.com.au/YjTrd97f/taste/2016/11/top-50-starters-117783-1.jpeg' },
    { id: 2, name: 'Main Course 1', category: 'main course', price: 20, imageUrl: 'mainCourse1.jpg' },
    { id: 3, name: 'Dessert 1', category: 'desserts', price: 8, imageUrl: 'dessert1.jpg' },
    { id: 4, name: 'Beverage 1', category: 'beverages', price: 5, imageUrl: 'beverage1.jpg' },
    // Add more items as needed
  ];

  getCategories(): string[] {
    return [...new Set(this.menuItems.map(item => item.category))];
  }

  getMenuItems(category: string): MenuItem[] {
    return this.menuItems.filter(item => item.category.toLowerCase() === category.toLowerCase());
  }
}
