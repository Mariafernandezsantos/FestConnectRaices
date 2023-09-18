import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeaturedFestivalsComponent } from './featured-festivals.component';

describe('FeaturedFestivalsComponent', () => {
  let component: FeaturedFestivalsComponent;
  let fixture: ComponentFixture<FeaturedFestivalsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FeaturedFestivalsComponent]
    });
    fixture = TestBed.createComponent(FeaturedFestivalsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
