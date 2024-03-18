import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-course',
  templateUrl: './main-course.component.html',
  styleUrls: ['./main-course.component.scss']
})
export class MainCourseComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  mains = [
    {
      title: 'The Bengaluru Brasserie',
      description: 'The Bengaluru Brasserie is an all-occasion brasserie, bar and a poolside restaurant that serves modern global cuisine in a relaxed setting.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/4/p/q/p42131-15344979475b76949be4c18.jpg?tr=tr:n-large'
    },

    {
      title: 'Spice Terrace',
      description: 'The most prominent feature here is the outdoor poolside seating area where one can enjoy sumptuous Indian delicacies along with fresh air, amazing weather, and a great view',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/1/m/n/p13467-15646445765d4294e08b5cc.jpg?tr=tr:n-xlarge'
    },
    
    {
      title: 'Ssaffron',
      description: 'Ssaffron, the award-winning restaurant on Level 19, brings the best of the countrys flavours alongside Japanese and Italian cuisines to present diners with exquisite dishes',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/2/c/q/p20210-162996205061273f42aa631.jpg?tr=tr:n-medium'
    },
    
    {
      title: 'Shang Palace',
      description: 'With flavors perfected over half a century, Shang Palace brings you elevated Far-Eastern cuisine.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/2/m/d/p20208-16075206845fd0d1accd452.jpg?tr=tr:n-large'
    },
    
    {
      title: 'Yauatcha',
      description: 'Yauatcha is a luxurious fine dining restaurant where you can go for a light lunch, meals or drinks with friends and family.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/1/r/g/p1194-148964845758ca3b49011ab.jpg?tr=tr:n-medium'
    },
    
    {
      title: 'Jamavar',
      description: 'Jamavar is a fine dining restaurant and bar specializing in North Indian cuisine which is known for its spicy indulgence and rich aroma.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/3/k/r/p3305-15317440565b4c8f38d8d2d.jpg?tr=tr:n-medium'
    },
    
    {
      title: 'Citrus',
      description: 'Citrus is a fine dining restaurant and bar located in The Leela Palace in Kodihalli, Bangalore.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/3/c/g/p3151-15317454295b4c94953c23f.jpg?tr=tr:n-medium'
    },
    
    {
      title: 'Zen',
      description: 'Zen is well-known for its specific Pan-Asian cooking techniques.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/3/a/f/p3340-1463470740573aca9492337.jpg?tr=tr:n-medium'
    },

    {
      title: 'Le Cirque Signature',
      description: 'Celebrating signature French and Italian dishes from the Flagship Le Cirque New York, diners are promised a gastronomical spectacle to remember.',
      image: 'https://im1.dineout.co.in/images/uploads/restaurant/sharpen/1/z/y/p18345-15439532505c06db6245aa9.jpg?tr=tr:n-medium'
    },
  ];

}
