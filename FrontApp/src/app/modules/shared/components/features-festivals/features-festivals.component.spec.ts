import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeaturesFestivalsComponent } from './features-festivals.component';

describe('FeaturesFestivalsComponent', () => {
  let component: FeaturesFestivalsComponent;
  let fixture: ComponentFixture<FeaturesFestivalsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FeaturesFestivalsComponent]
    });
    fixture = TestBed.createComponent(FeaturesFestivalsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
