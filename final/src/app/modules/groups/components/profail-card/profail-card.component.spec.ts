import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfailCardComponent } from './profail-card.component';

describe('ProfailCardComponent', () => {
  let component: ProfailCardComponent;
  let fixture: ComponentFixture<ProfailCardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProfailCardComponent]
    });
    fixture = TestBed.createComponent(ProfailCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
