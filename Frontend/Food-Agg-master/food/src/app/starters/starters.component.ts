import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-starters',
  templateUrl: './starters.component.html',
  styleUrls: ['./starters.component.scss']
})
export class StartersComponent implements OnInit {
  constructor() { }

  ngOnInit(): void {
  }
  starters = [
    {
      title: 'Roadhouse Cafe',
      description: 'Roadhouse cafe is a cool cafe n greater kailash n delhi. it has cool ambience.',
      image: 'https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0e/13/99/4d/open-terrace-indoor-outdoor.jpg?w=1200&h=-1&s=1'
    },

    {
      title: 'Bistro 37',
      description: 'This beautiful cafe offers unusual fare, including desi tadka fries, green inferno sandwiches, and roasted hazelnut iced coffee.',
      image: 'https://www.lueneburger-heide.de/_next/image?url=https%3A%2F%2Fdam.destination.one%2F887014%2Fb68fb3fa24245a0ec2c320d5579b280fdb4241268199f4dbd046376f42af80ca%2Fbistro37.jpg&w=3840&q=75'
    },
    
    {
      title: 'Cafe Delhi Heights',
      description: 'Cafe Delhi Heights is a well-known cafe chain that has outlets in various cities across India. The Noida outlet of Cafe Delhi Heights has a trendy and modern decor and serves a range of dishes, including burgers, pizzas, sandwiches, and salads.',
      image: 'https://images.travelandleisureasia.com/wp-content/uploads/sites/2/2023/10/05142012/Featured-Inside-16-1-1600x900.jpg'
    },
    
    {
      title: 'Big Yellow Door',
      description: 'Experience the inviting ambience and diverse range of pizzas at the Big Yellow Door Cafe, a popular spot to hang out with friends in Noida.',
      image: 'https://ik.imagekit.io/pu0hxo64d/uploads/gallery/interior-of-big-yellow-door-sector-104-575.JPG'
    },
    
    {
      title: 'Cafe 18',
      description: 'You can fully enjoy your food in this café’s pleasant and tranquil setting.',
      image: 'https://lh3.googleusercontent.com/w_L9k_K238mzgcNindyw4BHTYHRXWYIhXWkI0Qj-c1sPEAymz1Tp-XbPpdyuRB3xhF2as3hPuSoqXiL7octZ8zQK5R-C=w1200-rw'
    },
    
    {
      title: 'Maxout - The Experience',
      description: 'Asian, Bar Food, Sushi, North Indian, Chinese, Beverages',
      image: 'https://b.zmtcdn.com/data/pictures/3/20623873/49149d917d78fd7af38479f3684c9430.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*'
    },
    
    {
      title: '28 Spice Club',
      description: 'North Indian, Chinese, Greater Noida, 50.0 km',
      image: 'https://media-cdn.tripadvisor.com/media/photo-s/25/4b/fa/46/big-space.jpg'
    },
    
    {
      title: 'Imperfecto',
      description: 'This place needs no introduction! With its rustic interiors and awe-inspiring rooftop area,  Imperfecto in Gardens Galleria is one of the best places to enjoy Noida’s skyline!',
      image: 'https://b.zmtcdn.com/data/pictures/2/301442/267076b3c732b2f6eae722c93c25f129.jpg'
    },


    {
      title: 'Local',
      description: 'Explore extravagance with delectable food & exciting drinks at Local in Gardens Galleria. ',
      image: 'https://www.groovenexus.com/wp-content/uploads/2021/11/Local-noida-1.jpg'
    },



  ];
}
