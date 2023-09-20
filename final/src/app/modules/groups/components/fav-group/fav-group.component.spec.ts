import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FavGroupComponent } from './fav-group.component';

describe('FavGroupComponent', () => {
  let component: FavGroupComponent;
  let fixture: ComponentFixture<FavGroupComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FavGroupComponent]
    });
    fixture = TestBed.createComponent(FavGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
