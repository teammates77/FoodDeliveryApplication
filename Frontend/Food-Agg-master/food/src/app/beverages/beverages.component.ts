import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-beverages',
  templateUrl: './beverages.component.html',
  styleUrls: ['./beverages.component.scss']
})
export class BeveragesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  beverages = [
    {
      title: 'The Irish House',
      description: 'Inside the DLF Mall of India, you’ll find this gigantic pub with a vast bar menu and a laid-back ambience.',
      image: 'https://b.zmtcdn.com/data/pictures/2/18542962/73ef9cc4b912b5984704420778ffef3c.jpg'
    },

    {
      title: 'Toy Boy',
      description: 'The restaurant has a modern and stylish interior, with a relaxed atmosphere. The menu features a variety of dishes, from classic Italian to contemporary fusion cuisine.',
      image: 'https://content.jdmagicbox.com/comp/noida/x3/011pxx11.xx11.211221112804.i3x3/catalogue/toy-boy-noida-sector-38-noida-pubs-xx2q1226ph.jpg'
    },
    
    {
      title: 'Ministry of sound',
      description: 'Welcome to Ministry of Sound, the first microbrewery and nightclub experience in Noida. This premium party destination offers a selection of four house beers, two glamorous bars, and global delicacies. ',
      image: 'https://d4t7t8y8xqo0t.cloudfront.net/resized/720X480/restaurant%2F670367%2Frestaurant520200120120315.jpg'
    },
    
    {
      title: 'The Smoke Factory',
      description: 'Head to the Smoke Factory if you’re after good music and a place to let loose. We also approve of their food and drinks menu, so feel free to experiment with what you order.',
      image: 'https://b.zmtcdn.com/data/pictures/2/18279442/28776665e6a09f1561932597e5881b5f.jpg'
    },
    
    {
      title: 'Starbucks',
      description: 'Drinks · Oleato™ · Hot Coffees · Hot Teas · Hot Drinks · Frappuccino® Blended Beverages · Cold Coffees · Iced Teas · Cold Drinks. Cold Drinks .',
      image: 'https://cdn.vox-cdn.com/thumbor/9Ldn1l4eS8wtBuq0-FOTHxhHRKw=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/24042252/1420597598.jpg'
    },
    
    {
      title: 'Barista',
      description: 'Barista Coffee Company is the pioneer of coffee culture in India. The Barista Café chain delivers a true coffee experience...',
      image: 'https://media.licdn.com/dms/image/C561BAQFG0JWY-xQr-w/company-background_10000/0/1601460038058/barista_coffee_company_cover?e=2147483647&v=beta&t=YD65Rn1sFYUs8JuCS8ALj0LzhiFzD6xzOytn6JbjGb8'
    },
    
    {
      title: 'Café Pluck',
      description: 'Café Pluck is a casual, contemporary, and stylish delicatessen restaurant serving European, Italian and Indian fare.',
      image: 'https://d2e5ushqwiltxm.cloudfront.net/wp-content/uploads/sites/12/2019/03/11123127/Cafe-Pluck1-1.jpg'
    },
    
    {
      title: 'Shiro',
      description: 'Shiro is a Lounge with the perfect ambiance to relax and de-stress. The place is a heaven for people who are fond of Asian cuisine.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/1/e/i/p1352-16989225596543803f76c99.jpg?tr=tr:n-large'
    },


    {
      title: 'Costa Coffee',
      description: 'Our iconic Signature Blends are slow roasted for the perfect balance of rich flavour and smooth taste. ',
      image: 'https://www.foodbev.com/wp-content/uploads/2024/01/Costa-1.png'
    },



  ];

}

