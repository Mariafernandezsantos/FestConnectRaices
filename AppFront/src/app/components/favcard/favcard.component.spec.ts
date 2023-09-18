import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FavcardComponent } from './favcard.component';

describe('FavcardComponent', () => {
  let component: FavcardComponent;
  let fixture: ComponentFixture<FavcardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FavcardComponent]
    });
    fixture = TestBed.createComponent(FavcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
